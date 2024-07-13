package com.looping.logicTamil;
import java.util.Scanner;

public class sumofNaturalnums {

	public static void main(String[] args) {
		int n ,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER ONE n Value");
		 n = scan.nextInt();
		
		for (int i =1; i<=n;i++) {
			sum = sum+i;
		}
		System.out.println("sum =" + sum);
		
		

	}
	

}
