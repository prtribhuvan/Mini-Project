package com.admin.operation;

import java.sql.SQLException;
import java.util.Scanner;

import com.mini.project.UserOpration;

public class EcommerceApplication {

	        public static void main(String[] args) throws SQLException {
				
	        	System.out.println("** Welcome to E-Commerce based application **");
	        
	        	Scanner scanner	= new Scanner(System.in);
	        	
	        	System.out.println(" 1. User Operation ");
	        	System.out.println(" 2. Admin Operation ");
	        	System.out.println(" 3. Guest Operation ");
	        	
	        	int choise = scanner.nextInt();
	        	
	        	
	        	switch(choise) {
	        	
	        	    case 1 :
	        	    	
	        	    	UserOpration userOpration = new UserOpration();
	        	    	userOpration.getUserOpration();
	        	    	break ;
	        
	        	    case 2 : 
	        	    	 AdminOperation adminOperation = new AdminOperation();
	        			  adminOperation.getAdminOperation();
	        			 break;
	        	    case 3 :
	        	    	 GuestOperation1 guestOperation1 = new GuestOperation1();
	              	     guestOperation1.getGuestOperation();
	       	    	     break ;
	       	    	 default :
	       	             System.out.println("Invalid Input");
	       	    	     
	        	}
	      }
	        }
