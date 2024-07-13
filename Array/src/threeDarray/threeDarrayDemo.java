package threeDarray;
import java.util.Scanner;
public class threeDarrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("user plx enter size of school in array: ");
		int m = scan.nextInt();
		System.out.print("user plx enter size of class in array: ");
		int n = scan.nextInt();
		System.out.print("user plx enter no of students in array: ");
		int o = scan.nextInt();
		
		
		int a[][][]=new int[m][n][o];
		System.out.println("User plx provide the marks of "+m*n*o + " Students ");
		for(int i = 0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					 a[i][j][k]= scan.nextInt();
				}
			}
		}
		System.out.println("The marks of "+m*n*o + " Students are ");
		for(int i = 0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
					
				}
			}
			System.out.println();
		}
			

	}

}
