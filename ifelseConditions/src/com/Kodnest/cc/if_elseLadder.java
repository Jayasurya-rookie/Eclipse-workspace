package com.Kodnest.cc;

import java.util.Scanner;

public class if_elseLadder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// CTRL+2+L
		System.out.println("User plx enter ur age!");
		int age = scan.nextInt();
		scan.close();
		
		if (age>=18) {
			System.out.println("U R ELIGIBLE TO VOTE 😊");
		}
		if(age<18){
			System.out.println("U R NOT ELIGIBLE TO VOTE ");
			
			
			
		}
	
	}

}
