package com.kodnest.cc;
import java.util.Scanner;

public class whileLoopStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("user plx eneter one n value: ");
		int n = scan.nextInt();
		System.out.println("the even number for entered n values is ");
		scan.close();
		int i=0;
		while (i<=n) {
			System.out.println(i);
			i++;
		}
		System.out.println("end");
		
		

	}

}
