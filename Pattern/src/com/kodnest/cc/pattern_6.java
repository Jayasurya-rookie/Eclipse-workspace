package com.kodnest.cc;

import java.util.Scanner;

public class pattern_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter one value: ");
		int s = scan.nextInt();
		
		for(int k =1;k<=s;k++) {
			for(int i = 1; i<=s;i++) {//ladder for loop statement
				
				System.out.print("*");
				
			}
		
			
			for(int j = 1;j<=s;j++) {
				System.out.print("$");
				
			}
			System.out.println("");
		
			
		}
		
		
	

	}

}
