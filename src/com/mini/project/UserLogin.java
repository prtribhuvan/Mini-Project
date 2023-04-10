package com.mini.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class UserLogin {


	public void getUserLogin() throws SQLException {
		
		 
	  	  System.out.println("Enter username : ");
	  	  Scanner scanner = new Scanner(System.in);
	  	  String uname = scanner.next();
	  	  System.out.println("Enter password : ");
	  	  String pass = scanner.next();
		
		
	  	  

		  Connection con = null ;
		  PreparedStatement ps = null;
		  ResultSet rs= null ;
		  
		  try {
			
			  Class.forName("com.mysql.jdbc.Driver");
			  
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2(e-commerce)", "root","Pallavi@123");		  
			  
	                  ps = con.prepareStatement("select * from registration");  
			  
			        rs =  ps.executeQuery();
			  
			       while(rs.next()) {
			    	   
			    	   System.out.println("username :"+ rs.getString(4));
			    	   System.out.println("password :"+ rs.getString(5));
			    	   
			    	   
			    	   if((uname.equals(rs.getString(4)) )&&(pass.equals(rs.getString(5)) )){
			    		   
			    		   System.out.println("Enter your choise : ");
			    	   }else {
			    		   
			    		   throw new InvalidException("Invalid username and password");
			    	   }
			    	   
			    	   
			    	   
	}
			  
			  
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			con.close();
			ps.close();
			rs.close();
		
		}
		
		}
		
		             public static void main(String[] args) throws SQLException {
		            	 
		            	 UserLogin userLogin = new UserLogin();
		            	 userLogin.getUserLogin();
		            	 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		


	  
	  
	  
	  

}
