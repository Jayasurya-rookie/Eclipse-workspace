/*
 * FACTORS OF METHOD OVERLOADING
 */
//🙌NAME OF THE METHOD
//😊NO OF PARAMETERS
//*DATA TYPE OF PARAMETERS
//👍ORDER OF DATATYPES OF PARAMETERS
//(❁´◡`❁)TYPE CASTING ALSO PERFORM ITSELF IF THERE IS POSSIBLE


package com.kodnest.project;

public class DisneyChai {
	public static void main(String []args) {// for every methods call there must be equivalent method definitions
		//getBill();
		getBill(4,40);
		//getBill(4,"Masala Chai");
	}
	static void getBill() {
		System.out.println("Bill -1");
	}
	static void getBill(long a, byte b) {// for every method definition there is no
		System.out.println("Bill-2");
	}
	static void getBill(int quantity , String type) {
		System.out.println("Bill-3");
		
	}
	static void getBill(double a, double b) {
		System.out.println("Bill-4");
		
	}

}
