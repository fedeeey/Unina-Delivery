package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.DBConnection.DBConnection;
import Model.Entities.MezzoDiTrasporto;

public class MezzoDiTrasportoDAO {
	private Connection conn;
	private DBConnection dbcon;
	
	public void createMezzoDiTrasporto(MezzoDiTrasporto mezzoDiTrasporto) throws SQLException {
		dbcon = DBConnection.getDBconnection();
		PreparedStatement ps = null;
		try {
            conn = dbcon.getConnection();

            String query = "INSERT INTO mezzo_di_trasporto (targa, capacita_peso, capacita_spazio, disponibilita, modello) VALUES (?, ?, ?, ?, ?) RETURNING targa";
            ps = conn.prepareStatement(query);
            ps.setString(1, mezzoDiTrasporto.getTarga());
            ps.setInt(2, mezzoDiTrasporto.getCapacitàPeso());
            ps.setInt(3, mezzoDiTrasporto.getCapacitàSpazio());
            ps.setBoolean(4, mezzoDiTrasporto.getDisponibilita());
            ps.setString(5, mezzoDiTrasporto.getModello());

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