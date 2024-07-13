package arrayKodnesthomeWork;

import java.util.Scanner;

public class Array_chardatatype {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		
		int n = scan.nextInt();
		
		char ch[]=new char[n];
		//
		System.out.println("enter the element of size "+ n);
		for(int i =0;i<ch.length;i++) {
			ch[i]=scan.next().charAt(0);
		}
		//display the elements
		System.out.println("The elements are ");
		for(int i=0;i<ch.length;i++) {
				System.out.println(ch[i]);
		}
		System.out.println("reverse order");
		for(int i=n-1;i>=0;i--) {
			System.out.println(ch[i]);
		}


}
	}

