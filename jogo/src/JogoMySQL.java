import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JogoMySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/text_adventure_game";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void updateProgress(String playerName, boolean hasKey, boolean doorOpen) throws SQLException {
        Connection conn = connect();
        String query = "UPDATE player_progress SET has_key = ?, door_open = ? WHERE player_name = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setBoolean(1, hasKey);
        stmt.setBoolean(2, doorOpen);
        stmt.setString(3, playerName);
        stmt.executeUpdate();
        conn.close();
    }

    public static ResultSet getPlayerProgress(String playerName) throws SQLException {
        Connection conn = connect();
        String query = "SELECT * FROM player_progress WHERE player_name = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, playerName);
        return stmt.executeQuery();
    }
}