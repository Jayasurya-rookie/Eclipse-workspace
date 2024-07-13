package number_program;

import java.util.Scanner;

public class oddevenreminder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER N value");
		int n;
		n= scan.nextInt();
		int evensum=0,oddsum=0;
		n = Math.abs(n);
		
		while(n>0) {
			int digit =n%10;
			if(digit %2==0) {
				evensum = evensum+digit;
				
			}
			else {
				oddsum +=digit;
			}
	
			n=n/10;
		}
		System.out.println("sum of evendigits " + evensum);
		System.out.println("sum of odd " +oddsum);
		
	}

}
