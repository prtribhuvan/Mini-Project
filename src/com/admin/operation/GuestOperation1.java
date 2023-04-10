package com.admin.operation;

import java.sql.SQLException;
import java.util.Scanner;

public class GuestOperation1 {
	
          public void getGuestOperation() throws SQLException {		
		    Scanner scanner = new Scanner(System.in);
		   
		   System.out.println(" ** Guest Operation **");
		   System.out.println(" Enter Your Choise : ");
		   System.out.println("1.View Product Item ");
		   
		   int choise = scanner.nextInt();
		   
		    
		   switch(choise) {
		   
		   case 1:
			   GuestOperation guestOperation = new GuestOperation();
		    	guestOperation.getViewProductList();
		    	break;
		   default:
			   System.out.println("Invalid Input");
		    }
		   
		}
          
          public static void main(String[] args) throws SQLException {
			
        	  GuestOperation1 guestOperation1 = new GuestOperation1();
        	  guestOperation1.getGuestOperation();
		}

}
