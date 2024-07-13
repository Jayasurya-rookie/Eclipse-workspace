/*
 * WJP TO CHECK ELIGIBILITY TO VOTE OR NOT USING IF -ELSE STATMENT
 * WJP TO CHECK ELIGIBILITY TO CHECK ODD OR EVEN USING IF -ELSE STATMENT
 * 
 */
package com.Kodnest.cc;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);// CTRL+2+L
//		System.out.println("User plx enter ur age!");
//		int age = scan.nextInt();
		
		
//		if (age>=18) {
//			System.out.println("U R ELIGIBLE TO VOTE 😊");
//		}
//		else {
//			System.out.println("U R NOT ELIGIBLE TO VOTE :( ");
//			
////		}
//		System.out.println("User plx enter num!");
//		int num = scan.nextInt();
//		if(num%2==0) {
//			System.out.println("is even" );
//		}
//			
//		}
//		else {
//			System.out.println("is odd");
//		}
//		
//		
//		scan.close();
		/*
		 * TO CHCK IS +E OR -VE
		 */
		System.out.println("User plx enter num!");
		int num = scan.nextInt();
		if(num>0) {
			System.out.println("is +ve" );
		}
		if (num==0) {
			System.out.println("is neutral" );// LADDER CONDITIONS USE WHEN THERE IS TWO MORE CONNDITIONS
			
		}
		if(num<0) {
			System.out.println("is -ve");//LADDER ONLY IF CONDITIONS HAVE
		}
		
		
		scan.close();
		

	}

}
