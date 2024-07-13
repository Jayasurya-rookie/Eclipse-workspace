package com.kodnest.project1;
// 1.WITH PARAMETERS WITH RETURN TYPE
/*
public class Solution {
	public static void main(String[]args) {
		int a = 10;
		int b=20;
		
		int res= addition(a,b);
		System.out.println("the final result = " + res);
		
	}
	static int addition (int a, int b) {
		int result =0;
		result=a+b;
		return result;
		
	}

}
*/
//2. WITH PARAMETERS WIHTOUT RETURN TYPE
/*
public class Solution {
	public static void main(String[]args) {
		int a = 10;
		int b=20;
		
		 addition(a,b);
		
		
	}
	static void addition (int a, int b) {
		int result =0;
		
		result=a+b;
		
		System.out.println("the final result = " + result);
		
	}

}

*/
/*
//3.WITHOUT PARAMETERS WIHTOUT RETURN TYPE
import java.util.Scanner;

public class Solution {
	public static void main(String[]args) {
		
		square();
				
	}
	static void square () {
		Scanner scan= new Scanner(System.in);
		System.out.println("ENTER THE ONE INTEGER VALUE");
		int a = scan.nextInt();		
		System.out.println("the final result = " + (a*a));
		
	}

}
*/
//3.WITHOUT PARAMETERS WITH RETURN TYPE
import java.util.Scanner;

public class Solution {
	public static void main(String[]args) {
		
		square();
				
	}
	
	static int square() {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("ENTER THE ONE INTEGER VALUE");
		int a = scan.nextInt();	
		int result = 0;
		 result =a*a;
		
		return result;
		
	}

}


