package com.Array.cc;
import java.util.Scanner;
public class array_Demo {

	public static void main(String[] args) {
		System.out.println("User plx enter size of an array: ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int a[]=new int[size];
		System.out.println("The size of user given is: "+ size+"\n"+ "Kindly enter values");
		for(int i =0;i<=size-1;i++) {
			a[i]=scan.nextInt();
		}
		
		System.out.println("The user entered elements are: ");
		for(int i=0;i<=size-1;i++) {
			System.out.println(a[i]);
		}
		
		scan.close();

	}

}
