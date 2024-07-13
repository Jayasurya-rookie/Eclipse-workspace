package com.kodnest.cc;

import java.util.Scanner;

public class pattern_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter one value: ");
		int s = scan.nextInt();
		
		
		for(int i = 1; i<=s;i++) {// LADDER & NESTED FOR LOOP STATMENT
			
			for(int j = 1;j<=s;j++) {
				System.out.print("*");
				
			}
			System.out.println("*");
			
		}
		for(int i = 1; i<=s;i++) {             
			
			for(int j = 1;j<=s;j++) {
				System.out.print("$");
				
			}
			System.out.println("$");
			
		}
	
	
	


	}

}
