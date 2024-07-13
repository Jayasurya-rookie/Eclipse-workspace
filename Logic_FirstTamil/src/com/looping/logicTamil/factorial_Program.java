package com.looping.logicTamil;

import java.util.Scanner;

public class factorial_Program {

	public static void main(String[] args) {
		int n,factorial =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER ONE n Value");
		 n = scan.nextInt();
		
		for (int i =1; i<=n;i++) {
			factorial = factorial *i;
			
			
		}
		System.out.println("facotial of given num is " + factorial);

	}

}
