/*
 * GET 2 INPUT FROM USER. PERFORM ALL ARITHMETIC OPERATIONS AND DISPLAY
 */
package logicOperator;
import java.util.Scanner;

public class arithmeticOperators {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ENTER VALUE OF a");
		System.out.println("ENTER VALUE OF b");
		
		
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
	
		
		System.out.println("sum of a & b is " + (a+b));
		System.out.println("sub of a & b is " + (a-b));
		System.out.println("multiplication of a & b is " + (a*b));
		System.out.println("division of a & b is " + (a/b));
		System.out.println("modulus of a & b is " + (a%b));
/*
 * 	GET 2 INPUT FROM USER. PERFORM ALL ARITHMETIC OPERATIONS AND DISPLAY FOR ALL DATATYPES
 */
		System.out.println("--------------*----------------------");
		System.out.println("ENTER VALUE OF a1");
		System.out.println("ENTER VALUE OF b1");
		double a1 =scanner.nextDouble();
		double b1 =scanner.nextDouble();

		
		
		System.out.println("sum of a & b is " + (a1+b1));
		System.out.println("sub of a & b is " + (a1-b1));
		System.out.println("multiplication of a & b is " + (a1*b1));
		System.out.println("division of a & b is " + (a1/b1));
		System.out.println("modulus of a & b is " + (a1%b1));

		
		
		
	}

}
