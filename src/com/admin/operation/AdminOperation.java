package com.admin.operation;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminOperation {
	
	
	   public void getAdminOperation() throws SQLException {
		   
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("** Admin Operation **");
		   System.out.println(" Enter Your Choise : ");
		   System.out.println("7. Add Product Details ");
		   System.out.println("8. To Check The Bill ");
		   System.out.println("9. Check Quantity ");
		   System.out.println("10.Check Registered User ");
		   System.out.println("11. Check User History ");
		   
		    int choise = scanner.nextInt();
		    
		    
		    switch(choise) {
		    
		    case 7 :
		    	AddProduct addProduct = new AddProduct();
				  addProduct.getAddProductDetails();
                   break;
		    case 8 :
		    	CalculateBill calculateBill =new CalculateBill();
				calculateBill.getCalculate();
				break;
		    case 9 :
		    	CheckQuantity checkQuantity = new CheckQuantity();
				checkQuantity.getCheck(); 
			    break ;
		    case 10:
		    	RegisteredUserList registeredUserList = new RegisteredUserList();
				registeredUserList.getRegisteredUserList();
				break ;
		    case 11:

				UserHistory userHistory = new UserHistory();
				userHistory.getUserHistory();
				break;
			default:
				System.out.println("Invalid Input");
		 }
	}
	   public static void main(String[] args) throws SQLException {
		
		   AdminOperation adminOperation = new AdminOperation();
		   adminOperation.getAdminOperation();
	}

}
