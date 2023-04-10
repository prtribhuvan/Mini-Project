package com.admin.operation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mini.project.BuyProduct;
import com.mini.project.ConnectionTest;

public class AddProduct {


	  public void getAddProduct(int ProductId ,String ProductName,String Discription, int Quantity,int Price ) throws SQLException {
	 
	 Connection conn = null ;
	 PreparedStatement ps = null ;
	 
	 
try {
	  ConnectionTest connectionTest = new ConnectionTest();
		  conn = connectionTest.getConnection();
		  
		 ps =  conn.prepareStatement("insert into addproduct(ProductId,ProductName,Discription,Quantity,Price)values(?,?,?,?,?)");
		  
		  ps.setInt(1,ProductId );
		  ps.setString(2, ProductName);
		  ps.setString(3, Discription);
          ps.setInt(4, Quantity);
		  ps.setInt(5, Price);

		  
		 int a= ps.executeUpdate();
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally {
			
			conn.close();
			ps.close();
		}
}
	    public void getAddProductDetails() throws SQLException {
			
	    	 System.out.println("Enter number of item that you buy >> ");
	    	 Scanner scanner = new Scanner(System.in);
	    	 int number = scanner.nextInt();
	    	 
	    	 for(int i = 1 ; i<=number ; i++) {
	    		 
	    		 System.out.println("Enter ProductId >> ");
	    		 int id = scanner.nextInt();
	    		 
	    		 System.out.println("Enter product name >>");
	    		 String name = scanner.next();
	    		 

	    		 System.out.println("Enter Product Discription >>");
	    		 String discription = scanner.next();
	    		 
	    		 System.out.println("Enter Product Quantity>> ");
	    		 int quantity = scanner.nextInt();
	    		 
	    		 
	    		 System.out.println("Enter Product Price>> ");
	    		 int price = scanner.nextInt();

	    		 price = price*quantity;
	    		 
	    		  System.out.println("Total price >>> "+ price);
	    		 
	    		
	    		  AddProduct addProduct = new AddProduct();
	    		  addProduct.getAddProduct(id, name, discription, quantity, price);
	    		  
	    		  
	    	 }
		}
	
	  public static void main(String[] args) throws SQLException {
		
		  AddProduct addProduct = new AddProduct();
		  addProduct.getAddProductDetails();

	}
	
	
	
}
