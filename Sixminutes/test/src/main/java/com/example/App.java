package com.example;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        String url = "jdbc:mysql://localhost:3306/wongdb";
        String dbuser = "root";
        String password = "";
        Connection con=DriverManager.getConnection(url, dbuser, password);
        Statement stmt = con.createStatement();
        String query = "SELECT username, email FROM users";
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            String uname=rs.getString("username");
            String mail = rs.getString("email");
            System.out.println("Username: " + uname + ", Email: " + mail);

        }
        con.close();
        
        


    }
}
