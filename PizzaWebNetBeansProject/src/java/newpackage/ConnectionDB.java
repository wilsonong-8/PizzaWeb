package newpackage;
import java.sql.*;

public class ConnectionDB {
    private static Connection con;
    
    public static Connection getConnection()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            
        }
        return con;
    }    
}
