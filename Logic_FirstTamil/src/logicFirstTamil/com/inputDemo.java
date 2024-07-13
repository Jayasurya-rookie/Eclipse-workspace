/*
 * USER INPUT METHOS USING SCANNER CLASS
 * 1.SCAN ALL DIFFERENT DATATYPES USING SCANNER AND PRINT THEM
 */

package logicFirstTamil.com;
import java.util.Scanner;

public class inputDemo {
	public static void main(String [] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("ENTER YOUR NAME");
		String name = scanner.nextLine();
		
		System.out.println("HOW OLD ARE U!");
		int age =scanner.nextInt();
		System.out.println("YOUR PHONE NUM?");
		long num = scanner.nextLong();
		System.out.println("tell me pi   value!");
		double pi = scanner.nextDouble();
		
		System.out.println("u love blackpink!");
		boolean yes = scanner.nextBoolean();
		
		System.out.println("ENTER UR FAV CHAR");
		char fav = scanner.next().charAt(0);// FOR CHARACTER DATATYPES THE SCANNER CODE IS DIFFER
		
		scanner.nextLine();
		System.out.println("enter ur mail id");// AFTER INTEGER SCANNER USE ABOVE SCANNER LINE CODE TO SCAN MORE STRING DATATYPES
		String mail = scanner.nextLine();
		
		
		
		
		
		System.out.println("hello " + name);
		System.out.println("your age is " + age);
		System.out.println("UR CONTACT NUM IS " + num);
		System.out.println("pi value is " + pi);
		System.out.println("yes u love blackpink 😘" + yes);
		System.out.println("ur FAV CHARACTER IS " + fav);
		System.out.println("UR MAIL ID IS " + mail);
		
	}

}
