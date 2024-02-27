package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Model.DBConnection.DBConnection;
import Model.Entities.Prodotto;

public class ProdottoDAO {
	private Connection conn;
	private DBConnection dbcon;
	
	public void createProdotto(Prodotto prodotto) throws SQLException {
		dbcon = DBConnection.getDBconnection();
		PreparedStatement ps = null;
		try {
            conn = dbcon.getConnection();

            String query = "INSERT INTO cliente (id_prodotto, nome_prodotto, dimensioni, peso, quantita_disp, prezzo) VALUES (?, ?, ?, ?, ?, ?) RETURNING id_prodotto";
            ps = conn.prepareStatement(query);
            ps.setInt(1, prodotto.getIdProdotto());
            ps.setString(2, prodotto.getNomeProdotto());
            ps.setString(3, prodotto.getDimensioni());
            ps.setFloat(4, prodotto.getPeso());
            ps.setInt(5, prodotto.getQuantitaDisp());
            ps.setFloat(6, prodotto.getPrezzo());

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