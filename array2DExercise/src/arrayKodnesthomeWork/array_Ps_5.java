package arrayKodnesthomeWork;

import java.util.Scanner;

public class array_Ps_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("use plx enter the size of an arry");
		int n = scan.nextInt();
		int a[]= new int[n];
		System.out.println("User plx the elements for size: "+ n);
		for(int i =0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
		}
		System.out.println("the reverse order of given: ");
		int k=1;
		for(int i =a.length-1;i>=0;i--) {
			
			System.out.println("Elements "+k+" :"+a[i]);
			k++;
				//System.out.println("Elements "+" :"+ a[i]);
		}
		
		


	}

}
