import java.sql.*;

// https://youtu.be/_g8ljkh9JNY?si=mZnWBOQ1O8-kbge3
public class App2 
{
    //modified to use mariadb instead of mysql
    static final String DB_URL="jdbc:mariadb://localhost:3306/wongdb";
    //static final String DB_URL="jdbc:mysql://localhost:3306/wongdb";
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
                System.out.println("Username: " + username + " "+"Email: " + email);
                //System.out.println("Email: " + email);
            }
            stmt.close();
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
