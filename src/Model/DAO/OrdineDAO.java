package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;


import Model.DBConnection.DBConnection;
import Model.Entities.Ordine;

public class OrdineDAO {
	private Connection conn;
	private DBConnection dbcon;
	
	public void createOrdine(Ordine ordine) throws SQLException {
		dbcon = DBConnection.getDBconnection();
		PreparedStatement ps = null;
		try {
            conn = dbcon.getConnection();

            String query = "INSERT INTO ordine (id_ordine, data_ordine, completamento) VALUES (?, ?, ?) RETURNING id_ordine";
            ps = conn.prepareStatement(query);
            ps.setInt(1, ordine.getIdOrdine());
            //Casting a java.util.Date
            java.sql.Date sqlDate = new java.sql.Date(ordine.getDataOrdine().getTime());
            ps.setDate(2, sqlDate);
            ps.setBoolean(3, ordine.getCompletamento());

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
	
	 public List<Ordine> getAllOrdini() throws SQLException {
	        List<Ordine> orders = new ArrayList<>();
	        dbcon = DBConnection.getDBconnection();
	        PreparedStatement ps = null;
	        ResultSet rs = null;
	        try {
	            conn = dbcon.getConnection();
	            String query = "SELECT * FROM ordine";
	            ps = conn.prepareStatement(query);
	            rs = ps.executeQuery();
	            while (rs.next()) {
	                int idOrdine = rs.getInt("id_ordine");
	                Date dataOrdine = rs.getDate("data_ordine");
	                Boolean completamento = rs.getBoolean("completamento");
	                Ordine ordine = new Ordine(idOrdine, dataOrdine, completamento);
	                orders.add(ordine);
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
	        return orders;
	    } 
}
