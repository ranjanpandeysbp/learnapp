package com.mycompany.jdbc;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Scanner;

public class JdbcDeleteMenu {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = CreateConnection.connectToDatabase();

            String sql = "DELETE FROM menu WHERE category_id = ?";
            PreparedStatement statement = con.prepareStatement(sql);

            int categoryId;
            System.out.println("Enter the category Id:-");
            categoryId = sc.nextInt();

            statement.setInt(1,categoryId);

            int noOfRowsDeleted = statement.executeUpdate();

            if(noOfRowsDeleted > 0)
            {
                System.out.println("! row deleted sucessfully");
            }
            else
            {
                System.out.println("No rows deleted.");
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
