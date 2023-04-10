package com.mini.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



    public class AddCart {

	      public void getAddCart(int ProductId , String ProductName) throws SQLException {
		
		 
 		 Connection conn = null ;
          PreparedStatement ps = null ;	
		
		try {
			
			ConnectionTest connectionTest = new ConnectionTest();
			  conn = connectionTest.getConnection();
			  
			
         ps = conn.prepareStatement("insert into addcart1(ProductId, ProductName)values(?,?)");
  			   
           ps.setInt(1,ProductId );
           ps.setString(2, ProductName);;
         
            int a= ps.executeUpdate();
            
  			   
  			   
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			
			conn.close();
			ps.close();
			
		}

}			


       public void getSelect() throws SQLException {
    	   
    	   
    	   System.out.println("Enter the number of product that you want to add in cart >>");
	        Scanner scanner = new Scanner(System.in);
	          int number = scanner.nextInt();
	
	           AddCart addCart = new AddCart();

	          
	         for(int i = 1 ; i<=number ; i++) {
	
	           System.out.println("Enter product id >>");
	          int id = scanner.nextInt();
	           System.out.println("Enter product name >>");
	           String name = scanner.next();
	         
	           addCart.getAddCart(id, name);
	}
	 		System.out.println("Product has been added to your cart...");
 
          
	 		Connection conn = null ;
           PreparedStatement ps = null ;
 
 
              try {
	           ConnectionTest connectionTest = new ConnectionTest();
	             conn = connectionTest.getConnection();
	  
	
              System.out.println("Do you want view cart :");
  
                   String answer = scanner.next();
  
                String option1= "Yes";
  
              if(answer.equals(option1)) {
	  
	               ps = conn.prepareStatement("select * from addcart1");
	  
	               System.out.println();
	               
    	      ResultSet rs = ps.executeQuery();

    	      while(rs.next()) {
    	    	  
    	    	  System.out.println("Product Id >>"+ rs.getInt(1));
    	    	  System.out.println("Product Name >>"+ rs.getString(3));
    	      
    	    	  
    	      }
    	      }else {
    	    	  
    	    	  System.out.println("Enter your choise :");
    	      }
  
               }catch(Exception e) {
            	   e.printStackTrace();
	       }finally {
				
				conn.close();
				ps.close();
				
			}
  
}

          public static void main(String[] args) throws SQLException {
	
        	  AddCart addCart = new AddCart();
        	  addCart.getSelect();
	           
          }


}
