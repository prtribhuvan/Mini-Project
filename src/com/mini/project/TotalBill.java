package com.mini.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TotalBill {

	public void getPayment() throws SQLException{
		   
		   Connection conn = null ;
			 PreparedStatement ps = null ;
			 PreparedStatement ps1 = null ;

			 
		    try {
		    	ConnectionTest connectionTest = new ConnectionTest();
	             conn = connectionTest.getConnection();
				 
				 ps = conn.prepareStatement("select * from registration");

				 ps1 = conn.prepareStatement("select sum(price)from buyproductlist");
				  


				ResultSet rs =  ps.executeQuery();
				ResultSet rs1 =  ps1.executeQuery();

				 while(rs.next()) {

			    	   System.out.println("Username :"+ rs.getString(4));

				 }
				 
				 while(rs1.next()) {
					 
						System.out.println("Total Bill Amount: "+ rs1.getInt(1));

				 }
		   
		 }catch(Exception e) {
			   
			   e.printStackTrace();
		   }finally {
			   
			   conn.close();
			   ps.close();
			   ps1.close();

		   }
	   
	   
	
	}

	public static void main(String[] args) throws SQLException {
		
		   TotalBill totalBill = new TotalBill();
		   totalBill.getPayment();
		   
	}
	
	

}
