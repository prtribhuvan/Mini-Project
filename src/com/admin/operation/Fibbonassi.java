package com.admin.operation;

import java.util.Scanner;

public class Fibbonassi {
	
	public static void main(String[] args) {
		
	System.out.println("Enter the term >");	
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
		
		int a = 0 ; 
		int b = 1 ;
		int c;
		
		for(int i = 0; i<num ;i++) {
			
			System.out.println(a);
			
		c = a+b;
		a = c-a;
				
		b = c ; 
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
