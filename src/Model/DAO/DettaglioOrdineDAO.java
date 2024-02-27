package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.DBConnection.DBConnection;
import Model.Entities.DettaglioOrdine;

public class DettaglioOrdineDAO {
	private Connection conn;
	private DBConnection dbcon;
	
	public void createCliente(DettaglioOrdine dettaglio_ordine) throws SQLException {
		dbcon = DBConnection.getDBconnection();
		PreparedStatement ps = null;
		try {
            conn = dbcon.getConnection();

            String query = "INSERT INTO ordine (id_dettaglio, quantita) VALUES (?, ?) RETURNING id_dettaglio";
            ps = conn.prepareStatement(query);
            ps.setInt(1, dettaglio_ordine.getIdDettaglio());
            ps.setInt(2, dettaglio_ordine.getQuantita());

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
