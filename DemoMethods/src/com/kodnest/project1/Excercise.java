/*
 * AREA OF RHOMBUS
 */
package com.kodnest.project1;
import java.util.Scanner;
public class Excercise {
	static int surfaceArea(int d1, int d2) {
		int surface=d1*d2/2;
		return surface;
	}
	static void printSum(int price1, int price2) {
		int result =0;
		result = price1+price2;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
//		int area = surfaceArea(10,25);
//		System.out.println(area);
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter 1 num: ");
		int price1= scan.nextInt();
		System.out.println(" enter 2 num: ");
		int price2= scan.nextInt();
		printSum(price1,price2);
		
		
	
		

	}

}
