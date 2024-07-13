/*
 * DISPLAY THE FIRST ROW AND SECOND COLUMN OF THE MATRIXES
 */
package array2DExercise;

import java.util.Scanner;

public class display1stRow {

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
		
		//FIRST ROW ELEMENTS IN THE MATRIX ARE
		System.out.println("The first row elements in the matrix are: ");
		for(int i=0;i<1;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//SECOND COLUMN OF THE MATRIX
		System.out.println("The second Column matrix elements are: ");
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	

		

	}

}
