package com.mycompany.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class JdbcUpdateMenu {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = CreateConnection.connectToDatabase();

            String sql = "UPDATE menu SET Unit_Price = ? WHERE menu_id = ?";
            int unitPrice;
            int menuId;

            //Asking user input
            System.out.println("Enter the unit price:");
            unitPrice = sc.nextInt();
            System.out.println("Enter the menu Id:-");
            menuId = sc.nextInt();

            PreparedStatement statement = con.prepareStatement(sql);

            //setting the values to the query
            statement.setInt(1,unitPrice);
            statement.setInt(2,menuId);

            //Run the sql query
            int noOfRowsUpdated = statement.executeUpdate();

            if(noOfRowsUpdated > 0)
            {
                System.out.println("A row was updated sucessfully");
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
