package homework.Homework.TABLE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/lesson_homework";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "2667960113";

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        return connection;
    }

    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}



