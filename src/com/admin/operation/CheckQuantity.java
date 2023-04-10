package com.admin.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mini.project.ConnectionTest;

public class CheckQuantity {


	public void getCheck() throws SQLException{
		      
		   Connection conn = null ;
			 PreparedStatement ps = null ;

			 
		    try {
		    	ConnectionTest connectionTest = new ConnectionTest();
	             conn = connectionTest.getConnection();
	             
	             

				 ps = conn.prepareStatement("select Quantity from productlist where ProductId = 3");
				  
            

				ResultSet rs =  ps.executeQuery();
				

				
				
				 while(rs.next()) {
					 
					 
					 System.out.println("Quantity  is :"+ rs.getInt(1));

				 }
		   
		 }catch(Exception e) {
			   
			   e.printStackTrace();
		   }finally {
			   
			   conn.close();
			   ps.close();

		   }
	   }


	public static void main(String[] args) throws SQLException {
		
		
		CheckQuantity checkQuantity = new CheckQuantity();
		checkQuantity.getCheck(); 
	
	}
	
}
