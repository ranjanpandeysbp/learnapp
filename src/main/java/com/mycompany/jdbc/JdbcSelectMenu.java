package com.mycompany.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectMenu {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = CreateConnection.connectToDatabase();
            String sql = "SELECT * FROM menu";

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            int menuId = 0;
            String menuName = null;
            String menuDescription = null;
            int unitPrice = 0;
            int categoryId = 0;
            int count = 0;

            while(result.next())
            {
                menuId = result.getInt(1);
                menuName = result.getString(2);
                menuDescription = result.getString(3);
                unitPrice = result.getInt(4);
                categoryId = result.getInt(5);

                String format = "MenuItems %d:- %d--%s--%s--%d--%d";
                String formattedOutput = String.format(format, ++count, menuId,menuName,menuDescription,unitPrice,categoryId);
                System.out.println(formattedOutput);

            }


        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(ClassNotFoundException ce)
        {
            ce.printStackTrace();
        }
    }
}
