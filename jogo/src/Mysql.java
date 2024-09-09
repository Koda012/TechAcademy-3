import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
private static Connection connection;

public static Connection getConnection() {
if (connection == null) {
try {
Class.forName("com.mysql.cj.jdbc.Driver");
connection = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/jogo",
"root",
""
);
} catch (SQLException e) {
System.out.println("Erro ao tentar conectar ao banco de dados: " + e.getMessage());
} catch (ClassNotFoundException e) {
System.out.println("Driver JDBC não encontrado: " + e.getMessage());
}
}
return connection;
}
}
