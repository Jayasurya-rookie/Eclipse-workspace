package com.kodnest.datatype;

import java.util.Scanner;

public class DemoSolution {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("User please enter a byte value");
		
		byte b= scan.nextByte();
		System.out.println("The byte value is = "+b);
		System.out.println("User please enter a Integer");
		int c= scan.nextInt();
	
		System.out.println("The Integer is = "+c);
		System.out.println("User please enter a Boolean value");
		boolean d= scan.nextBoolean();
	
		System.out.println("The boolean is = " + d);
		System.out.println("User please enter a short value");
		short e= scan.nextShort();
	
		System.out.println("The short = " + e);
		
		
		
	}
			

}
