package com.mini.project;

import java.sql.SQLException;
import java.util.Scanner;

public class UserOpration {
	
	  
	     public void getUserOpration() throws SQLException {
	
	
		   Scanner scanner = new Scanner(System.in);
		
		   System.out.println(" **User Operation** ");
		   System.out.println(" Enter Your Choise: ");
		   System.out.println("1.Registration");
		   System.out.println("2.Login");
		   System.out.println("3.View ProductList");
		   System.out.println("4.List of Buyed Product");
		   System.out.println("5.Add and View Cart");
		   System.out.println("6.Total Bill");
		   
		   int choise = scanner.nextInt();
		   
		     
		     switch(choise) {
		     
		     case 1: 
		    	 Registration registration = new Registration();
		    	 
		    	  registration.getUserDetails();
                 break ;
                 
		     case 2:
		    	 UserLogin userLogin = new UserLogin();
            	 userLogin.getUserLogin();
            	 break;
		     case 3:

		    	 ProductList productList = new ProductList();
		    	 
		    	 productList.getProductList();
		    	 break;
		     case 4:
		    	 BuyProduct buyProduct = new BuyProduct();
	        	  buyProduct.getBuyProductDetails();
	        	  break;
		     case 5 :
		    	 AddCart addCart = new AddCart();
	        	  addCart.getSelect();
	        	  break;
		     case 6:

				   TotalBill totalBill = new TotalBill();
				   totalBill.getPayment();
				   break;
	          default:
	        	  System.out.println("Invalid Input");
		}
   }
	    public static void main(String[] args) throws SQLException {
			
	    	UserOpration userOpration = new UserOpration();
	    	userOpration.getUserOpration();
		}
	

}
