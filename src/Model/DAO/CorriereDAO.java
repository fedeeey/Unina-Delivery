package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.DBConnection.DBConnection;
import Model.Entities.Corriere;

public class CorriereDAO {
	private Connection conn;
	private DBConnection dbcon;
	
	public void createCorriere(Corriere corriere) throws SQLException {
		dbcon = DBConnection.getDBconnection();
		PreparedStatement ps = null;
		try {
            conn = dbcon.getConnection();

            String query = "INSERT INTO corriere (n_telefono_corriere, nome_corriere, cognome_corriere, disponibilita) VALUES (?, ?, ?, ?) RETURNING n_telefono_cliente";
            ps = conn.prepareStatement(query);
            ps.setString(1, corriere.getnTelefonoCorriere());
            ps.setString(2, corriere.getNomeCorriere());
            ps.setString(3, corriere.getCognomeCorriere());
            ps.setBoolean(4, corriere.getDisponibilita());

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