package util;

import java.sql.*;

public class ConnectionUtil {
    Connection conn = null;
    public static Connection connectdb()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skladove","root","hazard");
            System.out.println("Connection has been made");
            return conn;
        }
        catch(Exception e)
        {

            return null;
        }
    }
}
