/*1.WAJP TO TYPE CAST A LONG VALUE TO PRIMITIVE DATATYPES AVAILABLE IN JAVA

package com.kodnest.datatype;
import java.util.Scanner;
public class Workout {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the long value");
		
		long l = scan.nextLong();                      //shortcut ctrl + 2, l
	
		byte b=(byte)l;// long to byte type-casting
		System.out.println("the byte value is" + b);
		int i=(int)l;// long to integer type-casting
		System.out.println("the integer value is " + i);
		short s=(short)l;// long to short type-casting
		System.out.println("the short value is " + s);
		
		float f=l;
		System.out.println("the float value is = " + f);
		double d =l;
		System.out.println("the double value is = " + d);
		
		char c = (char)l;
		System.out.println("the character value is = " + c);
	
		
	}

}

/*2.WAJP TO READ 4 DECIMAL VALUES OF PRECISIONS IMPORTANCE FOR 2 DIGITS AND PERFORM ARTHITHMETIC OPERATIONS(+,-,*,/,%)
package com.kodnest.datatype;
import java.util.Scanner;
public class Workout {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 4 float value");
		float a= scan.nextFloat();
		float b= scan.nextFloat();
		float c= scan.nextFloat();
		float d= scan.nextFloat();
		
		
		System.out.println("the sum of = " + (a+b));
		System.out.println("the sub of = " + (a-b));
		System.out.println("the multiple of = " + (a*b));
		System.out.println("the quotient of = " + (a/b));
		System.out.println("the reminder of = " + (a%b));
	
		
	}
}

/*2.WAJP TO READ TWO INTEGER NUMBER AND DISPLAY THE AGE, NAME,CONTACT NUMBER OF A PERSON*/
/*

package com.kodnest.datatype;
import java.util.Scanner;
public class Workout {

	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your name");
		String s= scan.nextLine();
		System.out.println("Enter your age");
		int a= scan.nextInt();
		System.out.println("Enter your number");
		long l = scan.nextLong();
		
		
		System.out.println("Welcome😊" + s);
		System.out.println("you are " + a + " years old");
		System.out.println("your contact number is " + l );
	
	}
}
*/
/*3.WAJP TO READ TWO INTEGER NUMBER AND DISPLAY THE GREATER ONE*/

/*
package com.kodnest.datatype;
import java.util.Scanner;
public class Workout {

	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter two integer");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b) {
			System.out.println(a + " is greater than " + b);
		}
		else {
			System.out.println(a + " is smaller than " + b);
			
		}
	
		
	}
}
*/

/*4.WAJP TO READ TWO INTEGER NUMBER AND DISPLAY THE GREATER ONE*/


package com.kodnest.datatype;
import java.util.Scanner;
public class Workout {

	public static void main(String[]args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter ur age");
		int age=scan.nextInt();
		int age2=scan.nextInt();
		
		if(age>age2) {
			System.out.println(age +  " you are greater than " + age2);
		}
		else{
			System.out.println("you are younger");
		}
		
	
		
	}
}


