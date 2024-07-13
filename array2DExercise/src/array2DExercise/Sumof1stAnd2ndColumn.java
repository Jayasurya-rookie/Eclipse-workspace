package array2DExercise;

import java.util.Scanner;

public class Sumof1stAnd2ndColumn {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		//1st matrix size & scanner input from users
		System.out.print("Enter the row size for matrix 1 an array: ");
		int row=scan.nextInt();
		System.out.print("Enter the column size for matrix 1 an array: ");
		int column=scan.nextInt();
		System.out.println("User plx enter the " + row*column +" elements for 1st matrix: ");
		int [][]a = new int [row][column];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan.nextInt();
			}
		
		}
//		//2nd matrix size & scanner input from users
//		System.out.print("Enter the row size for matrix 2 an array: ");
//		int row1=scan.nextInt();
//		System.out.print("Enter the column size for matrix 2 an array: ");
//		int column1=scan.nextInt();
//		System.out.println("User plx enter the elements " + row1*column1 +" elements: ");
//		int [][]a1 = new int [row1][column1];
//		for(int i=0;i<a1.length;i++) {
//			for(int j=0;j<a1[i].length;j++) {
//				a1[i][j]=scan.nextInt();
//			}
//		}
		//int c[][]=new int [row][column];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a.length;j++) {
				if(i==0) {
					
					System.out.print(a[i][j]+ " ");
				}
		
				{
					
				} if(j==0||j==2) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	

		
		

	}

}
