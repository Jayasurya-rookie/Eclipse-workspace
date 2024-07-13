package com.kodnesttwoDarray.cc;
import java.util.Scanner;
public class twoDarrayDemo {
	

	public static void main(String[] args) {
 	Scanner scan = new Scanner(System.in);
 	System.out.println("User plx enter no of class; ");
 	int m = scan.nextInt();
 	System.out.println("User plx enter no of students; ");
 	int n = scan.nextInt();
 	
 	

		
		int [][]a=new int[m][n];
		System.out.println("Enter the "+ m*n +" marks of student");
	
		for(int i =0;i<=m-1;i++){
			
			for(int j=0;j<=n-1;j++) {
				a[i][j]=scan.nextInt();
				
			}
			
		}
		System.out.println("Marks of students are; ");
		for(int i =0;i<=m-1;i++){
			
			for(int j=0;j<=n-1;j++) {
				System.out.println(a[i][j]);
				
			}
			
		}


	}

}
