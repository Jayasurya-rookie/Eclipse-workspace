package selectionSort;
import java.util.Scanner;

public class selectionSortDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of matrix 1 row an array: ");
		int sum =0;
		int row=scan.nextInt();
		
		System.out.println("Enter the size of matrix 1 coloumn an array: ");
		int column=scan.nextInt();
		
		System.out.println("User plx enter the " + row*column +" elements: ");
		int [][]a = new int [row][column];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan.nextInt();
			}
			
		
		}
		System.out.println("Enter the size of matrix 2 row an array: ");
		int sum1 =0;
		int row1=scan.nextInt();
		
		System.out.println("Enter the size of matrix 2 coloumn an array: ");
		int column1=scan.nextInt();
		
		System.out.println("User plx enter the elements " + row1*column1 +" elements: ");
		int [][]a1 = new int [row1][column1];
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				a1[i][j]=scan.nextInt();
			}
			
		
		} 
		System.out.println("The summation of 2 matrix: ");
		int [][]c = new int[row][column];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				c[i][j]=a[i][j]+a1[i][j];
				
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("The subtraction of 2 matrix: ");
		int [][]c1 = new int[row][column];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				c1[i][j]=a[i][j]-a1[i][j];
				
				System.out.print(c1[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("The multiplication of 2 matrix: ");
		int [][]c2 = new int[row][column];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				for(int k =0;k<a[i].length;k++) {
					c2[i][j]+=a[i][k]*a1[k][j];
				}
				
				
				System.out.print(c2[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		System.out.println("The even elements present in 1st matrix: ");
		//int [][]a = new int[row][column];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				if(a[i][j]%2==0) {
					System.out.print(a[i][j]+" ");
					
				}
			}
			System.out.println(" ");
		}
		System.out.println("The sum of all even elements present in 1st matrix: ");
		//int [][]a = new int[row][column];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				if(a[i][j]%2==0) {
					sum+=a[i][j];
					System.out.print(sum+" ");
					
				}
			}
			System.out.println(" ");
		}
		
		System.out.println("The odd elements present in 1st&2nd matrix: ");
		
		int s[][]=new int[row][column];
		for(int i=0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				if((a[i][j]%2!=0)&&(a1[i][j]%2!=0)) {
					s[i][j]=a[i][j]+a1[i][j];
					System.out.print(s[i][j]+" ");
					
				}
			}
			System.out.println(" ");
		}
		
		
		
		
		

	}

}
