package arrayKodnesthomeWork;

import java.util.Scanner;

public class subStringofArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("use plx enter the size of an arry");
		int n = scan.nextInt();
		int a[]= new int[n];
		System.out.println("User plx the elements for size: "+ n);
		for(int i =0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
		}
		for(int i =0;i<a.length;i++) {
			for(int j =i;j<a.length;j++) {
				for(int k =i;k<=j;k++) {
					System.out.print(a[k]);
				}System.out.println( );
			}
		}
		

	}

}
