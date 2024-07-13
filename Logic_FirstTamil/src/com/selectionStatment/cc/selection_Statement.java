package com.selectionStatment.cc;
import java.util.Scanner;

public class selection_Statement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER");
		
		
		int a,b;
		a=scan.nextInt();
		System.out.println("ENTER SECOND NUMBER");
		b=scan.nextInt();
		System.out.println("ENTER ONE OPERATOR +,-,*,/ OR % :");
		char operator;
		operator = scan.next().charAt(0);
		
		
		switch (operator) {
		case'+': 
			System.out.println(a +"+" + b +"=" + (a+b) );
			break;
		case'-': 
			System.out.println(a +"-" + b +"=" + (a-b) );
			break;
		case'*': 
			System.out.println(a +"*" + b +"=" + (a*b) );
			break;
		case'/': 
			System.out.println(a +"/" + b +"=" + (a/b) );
			break;
		case'%': 
			System.out.println(a +"%" + b +"=" + (a%b) );
			break;
		default:
			System.out.println("INVALID OPERATOR");
		}
		scan.close();
		


	}

}
