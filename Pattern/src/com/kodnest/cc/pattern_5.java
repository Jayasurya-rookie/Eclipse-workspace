package com.kodnest.cc;

import java.util.Scanner;

public class pattern_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter one value: ");
		int s = scan.nextInt();
		
		
		for(int i = 1; i<=s;i++) {//nested for loop statement
			for(int j=1; j<=s;j++) {
				System.out.print("*");
				//System.out.print("$");
				
			}
			System.out.println("*");
		//	System.out.println("$");
			
	
	//		System.out.println("****$$$$");
//			System.out.print("*" + "*" +"*" +"*");
//			System.out.println("$" + "$" +"$" +"$");
			
			
		}
		
		
		
		

	}

}
