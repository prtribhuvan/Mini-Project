package com.mini.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Registration {

	
	      public void getUserDetails() throws SQLException{
	    	  
	    	  
	    	  System.out.println("Enter firstname >>");
	      	   Scanner scanner = new Scanner(System.in);
	      	   String fname = scanner.next();
	      	   System.out.println("Enter lastname >>");
	      	   String lname = scanner.next();
	      	   System.out.println("Enter username >>");
	      	   String uname = scanner.next();
	      	   System.out.println("Enter password >>");
	      	   String pass = scanner.next();
	      	   System.out.println("Enter city >>");
	      	   String city = scanner.next();
	      	   System.out.println("Enter email >>");
	      	   String email= scanner.next();
	      	   System.out.println("Enter number >>");
	      	   String number = scanner.next();



	      	getUserData(fname, lname, uname, pass, city, email, number);

	}
	
	public void getUserData(String firstname,String lastname,String username,String password,String city ,String email,String number) throws SQLException {
		 
		 Connection conn=null ;
		 PreparedStatement ps = null ;
		 
		 
		 try {
			
			 ConnectionTest connectionTest = new ConnectionTest();
			  conn = connectionTest.getConnection();
			 
     ps = conn.prepareStatement("insert into registration(firstname,lastname,username,password,city ,email,number)values(?,?,?,?,?,?,?)");
			 
        ps.setString(1,firstname);
        ps.setString(2,lastname);
        ps.setString(3,username);
        ps.setString(4,password);
        ps.setString(5,city);
        ps.setString(6,email);
        ps.setString(7,number);

		
		 int a = ps.executeUpdate();
		 
		 System.out.println("Registration successfully done....."+a);
		 
		 } catch (Exception e) {
			 
			 e.printStackTrace();
		}finally {
			conn.close();
			ps.close();
		}
	  }

      public static void main(String[] args) throws SQLException {
		
   	  
    	  Registration registration = new Registration();
    	  registration.getUserDetails();
	}
}
