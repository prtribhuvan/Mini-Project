package com.mini.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ProductList {

	  
	public void getProductList() throws SQLException {
		   
		   Connection con = null ;
		   PreparedStatement ps = null ;
		   ResultSet rs = null ;
		   
		   try {
			
			   Class.forName("com.mysql.jdbc.Driver");

    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject2(e-commerce)","root","Pallavi@123");
	
        ps = con.prepareStatement("select * from productlist");
			   
            rs =  ps.executeQuery();
           
           while(rs.next()) {
         	  
         	  System.out.println("productId >> "+ rs.getInt(1));
         	  System.out.println("productname >> "+ rs.getString(2));
         	  System.out.println("product discription >> "+ rs.getString(3));
         	  System.out.println("product price >> "+ rs.getString(4));
         	  System.out.println("available quantity >> "+ rs.getInt(5));
              
         	  System.out.println();
         	  
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
			
	    	 ProductList productList = new ProductList();
	    	 
	    	 productList.getProductList();
	    	 
	    	 
	    	 
		}

}
