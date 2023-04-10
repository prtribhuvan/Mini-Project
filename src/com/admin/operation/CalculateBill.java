package com.admin.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mini.project.ConnectionTest;
import com.mini.project.TotalBill;

public class CalculateBill {

	
	public void getCalculate() throws SQLException{
		   
		   Connection conn = null ;
			 PreparedStatement ps = null ;

			 
		    try {
		    	ConnectionTest connectionTest = new ConnectionTest();
	             conn = connectionTest.getConnection();
				 
	             System.out.println("Admin calculating the bill...");

				 ps = conn.prepareStatement("select sum(price)from addproduct");
				  


				ResultSet rs =  ps.executeQuery();

				
				 while(rs.next()) {
					 
						System.out.println("Total Bill Amount: "+ rs.getInt(1));

				 }
		   
		 }catch(Exception e) {
			   
			   e.printStackTrace();
		   }finally {
			   
			   conn.close();
			   ps.close();

		   }
	   }

	public static void main(String[] args) throws SQLException {
		
		CalculateBill calculateBill =new CalculateBill();
		
		calculateBill.getCalculate();
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
