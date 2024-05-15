import java.sql.*;


// start Mobile VPN to AS400 to use 192.168.0.100 IP address
// Command line
// Cd C:\xampp\htdocs\javatut\JavaTelusko>
// set classpath=C:\tn5250j080c\jt400.jar;.
// javac As400.java
// java As400

public class As400 
{
    //modified to use mariadb instead of mysql
    // static final String DB_URL="jdbc:mariadb://localhost:3306/wongdb";
    static final String DB_URL="jdbc:as400://192.168.0.100;translate binary=true";
    static final String DB_USER="A73TTF";
    static final String DB_PASS="FALKEN012";
    static final String QUERY="select * from titan4src.f4111c";

    public static void main(String[] args) throws Exception 
    {
        System.out.println("AS/400 Connection");
        Class.forName ("com.ibm.as400.access.AS400JDBCDriver");
        // open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) 
        {
                // extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                //int fid = rs.getInt("ILITM");
                String username = rs.getString("illitm");
                String email = rs.getString("ilmcu");
                

                // Display values
                // System.out.println("ILLITM: " + username + " "+"ILMCU: " + email+" "+fid);
                System.out.println("ILLITM: " + username + " "+"ILMCU: " + email);
                
            }
            stmt.close();
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
