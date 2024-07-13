package ExceptionDemo;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number-1");
		try {
		int a =scan.nextInt();
		System.out.println("Enter number-2");
		int b = scan.nextInt();
		
			int c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("Use enter valid num except zero ");
		}
		catch(Exception e) {
			System.out.println("User enter valid input u asshole");
		}
		
		
		
		//Arithmetic exception
		//InputmismatchException

	}

}
