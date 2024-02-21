package Model.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbcon = null;
    private Connection conn = null;

    private DBConnection() {}

    public static DBConnection getDBconnection() {
        if (dbcon == null)
            dbcon = new DBConnection();
        return dbcon;
    }

    public Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/UninaDelivery", "postgres", "1234");
            }
        } catch (SQLException | ClassNotFoundException throwables) {
        	throw new RuntimeException("Errore durante la connessione al database", throwables);
        }
        return conn;
    }

    public void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException throwables) {
            throw new RuntimeException("Errore durante la chiusura della connessione", throwables);
        }
    }
}