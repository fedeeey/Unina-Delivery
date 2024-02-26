package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            //Casting per usare java.util.Date
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
	
}