package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import Model.DBConnection.DBConnection;
import Model.Entities.Cliente;

public class ClienteDAO {
	private Connection conn;
	private DBConnection dbcon;
	
	public void createCliente(Cliente cliente) throws SQLException {
		dbcon = DBConnection.getDBconnection();
		PreparedStatement ps = null;
		try {
            conn = dbcon.getConnection();

            String query = "INSERT INTO cliente (email_cliente, n_telefono_cliente, nome, cognome, data_nascita, indirizzo_predefinito) VALUES (?, ?, ?, ?, ?, ?) RETURNING email_cliente";
            ps = conn.prepareStatement(query);
            ps.setString(1, cliente.getEmailCliente());
            ps.setString(2, cliente.getnTelefonoCliente());
            ps.setString(3, cliente.getNome());
            ps.setString(4, cliente.getCognome());
            //Casting a java.util.Date
            java.sql.Date sqlDate = new java.sql.Date(cliente.getDataNascita().getTime());
            ps.setDate(5, sqlDate);
            ps.setString(6, cliente.getIndirizzoPredefinito());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
	}
	
	 public List<Cliente> getAllClienti() throws SQLException {
	        List<Cliente> customers = new ArrayList<>();
	        dbcon = DBConnection.getDBconnection();
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        try {
	            conn = dbcon.getConnection();
	            String query = "SELECT * FROM cliente";
	            ps = conn.prepareStatement(query);
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                String emailCliente = rs.getString("email_cliente");
	                String nTelefonoCliente = rs.getString("n_telefono_cliente");
	                String nome = rs.getString("nome");
	                String cognome = rs.getString("cognome");
	                Date dataNascita = rs.getDate("data_nascita");
	                String indirizzoPredefinito = rs.getString("indirizzo_predefinito");
	                Cliente cliente = new Cliente(emailCliente, nTelefonoCliente, nome, cognome, dataNascita, indirizzoPredefinito);
	                customers.add(cliente);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            if (rs != null) {
	                try {
	                    rs.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (ps != null) {
	                try {
	                    ps.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (conn != null) {
	                try {
	                    conn.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        return customers;
	    }
	
}