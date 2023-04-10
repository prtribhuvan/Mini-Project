package com.admin.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mini.project.ConnectionTest;

public class RegisteredUserList {
	
	

	public void getRegisteredUserList() throws SQLException{
		   
		   Connection conn = null ;
			 PreparedStatement ps = null ;

			 
		    try {
		    	ConnectionTest connectionTest = new ConnectionTest();
	             conn = connectionTest.getConnection();
				 

				 ps = conn.prepareStatement("select * from registration");
				  
            

				ResultSet rs =  ps.executeQuery();

				
				
				 while(rs.next()) {
					 
                 System.out.println("username >> "+ rs.getString(4));
                 System.out.println("FirstName >> "+ rs.getString(2));
                 System.out.println("LastName >> "+ rs.getString(3));
                 System.out.println("City >> "+ rs.getString(6));
                 System.out.println("Email >> "+ rs.getString(7));
                 System.out.println("Number >> "+ rs.getString(8));

                 
                 
				 }
		   
		 }catch(Exception e) {
			   
			   e.printStackTrace();
		   }finally {
			   
			   conn.close();
			   ps.close();

		   }
	   }


	public static void main(String[] args) throws SQLException {
		
		RegisteredUserList registeredUserList = new RegisteredUserList();
		registeredUserList.getRegisteredUserList();
		
	}

}
