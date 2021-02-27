package com.mycompany.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
    public static Connection connectToDatabase()
    {
        String dbURL = "jdbc:mysql://localhost:3306/zomato";
        String username = "root";
        String password = "";
        Connection con = null;

        try
        {
            con = DriverManager.getConnection(dbURL,username,password);

        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return con;
    }
}
