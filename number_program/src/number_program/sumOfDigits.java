package number_program;
import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter one n value: ");
		int n;
		n = scan.nextInt();
		while(n>0) {
			int rem =n%10;
			int dib=n/10;
			n=dib;
			System.out.println(rem);
		}
		
//		for(int i =1; i<=n;i++) {
//			sum = sum+i;
//		}
//		System.out.println("sum is " + sum);
		

	}

}
