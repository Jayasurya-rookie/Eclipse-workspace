package number_program;
import java.util.Scanner;

public class number_separateLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("enter one n value: ");
		n =scan.nextInt();
		int sum=0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			sum=sum+rem;
			System.out.println(sum);
		}
		
//		for(int rem =n%10;n>0;n=n/10) {
//
//			
//			System.out.println(rem);
//		}
		
		
		

	}

}
