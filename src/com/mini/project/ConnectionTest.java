package com.mini.project;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionTest {

	public Connection getConnection() {
			 
			   Connection connection = null;
			  
			   try {
				
				   Class.forName("com.mysql.jdbc.Driver");
				   
				   connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2(e-commerce)", "root", "Pallavi@123");
				
				   
				  } catch (Exception e) {
					  
					  e.printStackTrace();
			}
			   return connection ;
			   
		   }

	
}
