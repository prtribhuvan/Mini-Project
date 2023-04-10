package com.mini.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class BuyProduct {


	  public void getBuyProduct(int ProductId , int Quantity ,int Price) throws SQLException {
	 
	 Connection conn = null ;
	 PreparedStatement ps = null ;
	 
	 
  try {
	  ConnectionTest connectionTest = new ConnectionTest();
		  conn = connectionTest.getConnection();
		  
		 ps =  conn.prepareStatement("insert into buyproductlist(ProductId,Quantity,Price)values(?,?,?)");
		  
		  ps.setInt(1,ProductId );
		  ps.setInt(2, Quantity);
		  ps.setInt(3, Price);

		  
		 int a= ps.executeUpdate();
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			
			conn.close();
			ps.close();
		}
}
	  
          public void getBuyProductDetails() throws SQLException {			
	    	 
        	  System.out.println("Enter number of item that you want to buy >> ");
	    	 Scanner scanner = new Scanner(System.in);
	    	 int number = scanner.nextInt();
	    	 
	    	 for(int i = 1 ; i<=number ; i++) {
	    		 
	    		 System.out.println("Enter ProductId >> ");
	    		 int id = scanner.nextInt();
	    		 
	    		 System.out.println("Enter ProductQuantity>> ");
	    		 int quantity = scanner.nextInt();
	    		 
	    		 
	    		 System.out.println("Enter Product Price>> ");
	    		 int price = scanner.nextInt();

	    		 price = price*quantity;
	    		 
	    		  System.out.println("Total price >>> "+ price);
	    		 
	    		 BuyProduct buyProduct = new BuyProduct();
	    		 buyProduct.getBuyProduct(id,quantity,price);
	    	 }
		}
          public static void main(String[] args) throws SQLException {
			
        	  BuyProduct buyProduct = new BuyProduct();
        	  buyProduct.getBuyProductDetails();
		}
          
}
