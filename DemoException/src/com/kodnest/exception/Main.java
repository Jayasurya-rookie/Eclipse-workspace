package com.kodnest.exception;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bank app started");
		int original = 1234;
		int balance = 4000;
		System.out.println("enter a pin");
		
		try {
			if(original == scan.nextInt()) {
				System.out.println("Balance is "+ balance);
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Enter a valid pin "+e);
				
	
			}
		finally {
			scan.close();
			System.out.println("Bank app terminated");

		}
		
		

	}

}






//String s=null+"";
//System.out.println(s);
//