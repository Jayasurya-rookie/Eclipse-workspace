package com.Array.cc;
import java.util.Scanner;

public class twodArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row size! ");
		int rows = scan.nextInt();
		System.out.println("Enter column size! ");
		int columns = scan.nextInt();
		int a[][]=new int [rows][columns];
		System.out.println("User plx enter the element of "+ (rows*columns)+ " matrix");
		//FIRST MATRIX SCANNER
				for(int i =0;i<a.length;i++) {
					for (int j =0;j<a[i].length;j++) {
						a[i][j]=scan.nextInt();
					}
				}
		// SECOND MATRIX INPUT
		
		System.out.println("Enter 2 MATRIX row size! ");
		int rows2 = scan.nextInt();
		System.out.println("Enter 2 column size! ");
		int columns2 = scan.nextInt();
		int b[][]=new int [rows2][columns2];
		System.out.println("User plx enter the element of "+ (rows2*columns2)+ " 2 matrix");
		
		//SECOND MATRIX SCANNER
		for(int i =0;i<b.length;i++) {
			for (int j =0;j<b[i].length;j++) {
				b[i][j]=scan.nextInt();
			}
		}
		
		//to display el;element of 2d array
		for(int i=0;i<a.length;i++) {
			for(int j =0; j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("==============");
		for(int i=0;i<b.length;i++) {
			for(int j =0; j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
		

	}

}
