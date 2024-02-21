package Model.DAO;

import Model.DBConnection.DBConnection;
import Model.Entities.Operatore;
import java.sql.*;

public class OperatoreDAO {
	private Connection conn;
	private DBConnection dbcon;
	
	public void createOperatore(Operatore operatore) throws SQLException {
		dbcon = DBConnection.getDBconnection();
		PreparedStatement ps = null;
		try {
            conn = dbcon.getConnection();

            String query = "INSERT INTO operatore (email_operatore, password, nome_operatore, cognome_operatore, n_telefono_operatore) VALUES (?, ?, ?, ?, ?) RETURNING email_operatore";
            ps = conn.prepareStatement(query);
            ps.setString(1, operatore.getEmailOperatore());
            ps.setString(2, operatore.getPassword());
            ps.setString(3, operatore.getNomeOperatore());
            ps.setString(4, operatore.getCognomeOperatore());
            ps.setString(5, operatore.getnTelefonoOperatore());

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


	public Operatore getOperatoreByEmail(String email) {
	    Operatore operatore = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        conn = dbcon.getConnection();
	        String query = "SELECT * FROM operatore WHERE email_operatore = ?";
	        ps = conn.prepareStatement(query);
	        ps.setString(1, email);
	        rs = ps.executeQuery();

	        if (rs.next()) {
	            operatore = new Operatore(rs.getString("email_operatore"), rs.getString("password"), rs.getString("nome_operatore"), rs.getString("cognome_operatore"), rs.getString("n_telefono_operatore"));
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
	    return operatore;
	}
}
