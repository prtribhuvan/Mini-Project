package com.admin.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mini.project.ConnectionTest;

public class UserHistory {
	
	

	public void getUserHistory() throws SQLException{
		   
		   Connection conn = null ;
			 PreparedStatement ps = null ;

			 
		    try {
		    	ConnectionTest connectionTest = new ConnectionTest();
	             conn = connectionTest.getConnection();
				 

				 ps = conn.prepareStatement("select * from  buyproductlist where id=2");
				  
            

				ResultSet rs =  ps.executeQuery();

				
				
				 while(rs.next()) {
					 
               System.out.println("ProductId >> "+ rs.getInt(1));
               System.out.println("Price >> "+ rs.getInt(3));
               System.out.println("Quantity >> "+ rs.getInt(4));

				 }
		   
		 }catch(Exception e) {
			   
			   e.printStackTrace();
		   }finally {
			   
			   conn.close();
			   ps.close();

		   }
	   }


	public static void main(String[] args) throws SQLException {
		
		UserHistory userHistory = new UserHistory();
		userHistory.getUserHistory();
		
	}

	
	

}
