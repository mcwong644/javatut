import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class App2 
{
    //static final String DB_URL="jdbc:mariadb://localhost:3306/wongdb";
    static final String DB_URL="jdbc:mysql://localhost:3306/wongdb";
    static final String DB_USER="root";
    static final String DB_PASS="";
    static final String QUERY="select * from users";

    public static void main(String[] args) throws Exception 
    {
        System.out.println("MariaDB Connection");
        Class.forName ("org.mariadb.jdbc.Driver");
        // open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) 
        {
                // extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                String username = rs.getString("username");
                String email = rs.getString("email");

                // Display values
                System.out.println("Username: " + username);
                System.out.println("Email: " + email);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
