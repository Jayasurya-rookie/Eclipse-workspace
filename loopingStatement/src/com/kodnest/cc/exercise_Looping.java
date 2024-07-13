package com.kodnest.cc;
import java.util.Scanner;

public class exercise_Looping {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("USER ENTER ONE N VALUE: ");
		int n =scan.nextInt();
		for(int i =1; i<=10;i++) {
			System.out.println(i + "x"+ n +" = " + (i*n));
		}
		scan.close();
		

	}

}
