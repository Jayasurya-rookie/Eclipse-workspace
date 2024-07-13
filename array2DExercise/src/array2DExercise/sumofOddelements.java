/*
 * SUM OFODD ELEMENTS PRESENT IN THE MATRIXES ARE
 */
package array2DExercise;

import java.util.Scanner;

public class sumofOddelements {

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
		//2nd matrix size & scanner input from users
		System.out.print("Enter the row size for matrix 2 an array: ");
		int row1=scan.nextInt();
		System.out.print("Enter the column size for matrix 2 an array: ");
		int column1=scan.nextInt();
		System.out.println("User plx enter the elements " + row1*column1 +" elements: ");
		int [][]a1 = new int [row1][column1];
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				a1[i][j]=scan.nextInt();
			}
		} 
		System.out.println("The sum of odd elements in two matrix are: ");
		int c[][]=new int[row][column];
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				if((a[i][j]%2!=0)&&(a1[i][j]%2!=0)) {
					c[i][j]=a[i][j]+a1[i][j];
					System.out.print(c[i][j]+ " ");
				}
			}
			System.out.println();
		}
		
		
	
		// TODO Auto-generated method stub

	}

}
