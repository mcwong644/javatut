import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
public class App3 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("MariaDB Connection");
        Statement sqlSt; //run SQL
        //String useSQL = new String("use wongdb");
        //String output;
        ResultSet result;
        String SQL="select * from users order by username";

        //String[] books;
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            String dbURL="jdbc:mariadb://localhost:3306/wongdb";
            Connection dbConnect = DriverManager.getConnection(dbURL, "root","");
            //Connection dbConnect = DriverManager.getConnection("jdbc:mariadb://localhost:3306/wongdb?user=root&password=myPassword");
            sqlSt = dbConnect.createStatement(); //allows SQL to be executed
            result = sqlSt.executeQuery(SQL);
            // result holds the output from SQL
            while(result.next() != false){
                //output = result.getString("username") +" "+ result.getString("email");
                System.err.println(result);
            }
            sqlSt.close();
        } 
        catch(ClassNotFoundException ex)
        {
            Logger.getLogger(App3.class.getName()).log(Level.SEVERE,null, ex);
            System.err.println("Class not found, check the JAR");
            
        }
        catch(SQLException ex)
        {
            Logger.getLogger(App3.class.getName()).log(Level.SEVERE,null, ex);
            System.err.println("SQL error, check the connection");
            System.err.println("SQL IS BAD!!" + ex.getMessage());

        }
    }
}
