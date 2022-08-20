package test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnection 
{
	public static void main (String[]args)
	{

		String ConnectionURL = "jdbc:sqlserver://WESLLEYPC.ERP.windows.net:1433;"
				                + "database=ERP;"
				                + "user=WESLLEYPC/AMD@WESLLEYPC;"
				                + "password=;"
				                + "encrypt=true;"
				                + "trustServerCertificate=false;"
				                + "loginTimeout=30;";;
				                
        try (Connection connection = DriverManager.getConnection(ConnectionURL);
        		Statement statement = connection.createStatement();)
        { 
	        {
	        	String select = "Select @@Version";
	        	
	        	ResultSet resultSet = statement.executeQuery(select);
	        	
	            while (resultSet.next()) 
	            {
	                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
	            }
	        }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
	}
}}
