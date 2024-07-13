/*
 * ADD 100 TO A NUMBER USING COMPOUND ASSIGNMENT OPERATOR
 */
package logicOperator;

import java.util.Scanner;

public class compoundAssignment {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("ENTER VALUE OF a");
		System.out.println("ENTER VALUE OF b");
		
		
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
	
		
		System.out.println("compound assignemt 100 of a  is " + (a+=100));
		System.out.println("compound assignemt 100 of b  is " + (b+=100));
		
		
	

	}

}
