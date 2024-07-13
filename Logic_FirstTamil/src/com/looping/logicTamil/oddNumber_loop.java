package com.looping.logicTamil;
import java.util.Scanner;
public class oddNumber_loop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER ONE n value");
		int n = scan.nextInt();
		System.out.println("the odd num for entered n value is");
		for( int i =1; i<=n; i=i+2) {
			System.out.println(i);
			
		}
		

	}

}
