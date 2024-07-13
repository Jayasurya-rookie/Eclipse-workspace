package com.kodnest.cc;
import java.util.Scanner;

public class pattern_8new {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter one n value: ");
		
		int n = scan.nextInt();
		
		for(int i =1; i<=n;i++) {
			
			for(int j =1; j<=n;j++) {
				System.out.println("*");
				
			}
		
			
		}
		for(int i =1; i<=n;i++) {
			
			for(int j =1; j<=n;j++) {
				System.out.print("#");
				
			}
			System.out.println("#");
			
		}
	
	


	}

}
