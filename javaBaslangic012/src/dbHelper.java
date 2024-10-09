import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbHelper {
    private String username = "root";
    private String password = "14563970";
    private String dbUrl = "jdbc:mysql://localhost:3306/javawithmysql";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,username,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error..: " + exception.getMessage());
        System.out.println("Error Code..: " + exception.getErrorCode());
    }

}
