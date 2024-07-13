package com.methods.cc;

public class Solution {
	public static void main(String... args) 
	{
	System.out.println("Hello");	
	main("2");
	main(2);
	
	}
	static void main(String a ) {
		System.out.println(a);
		main(2);
	}
	static void main(int a) {
		System.out.println(4);
	}
}

/*
 * POSSIBLE WAYS TO WRITE MAIN METHOD IN JAVA
 */
//static public void main(String []args) 
//public static void main(String[]args) 
//public static void main(String []surya) 
//public static void main(String []args) 
//public static void main(String args[]) 
//final public static void main(String args[]) 
//final synchronized public static void main(String args[])
//final public synchronized static void main(String args[])/
//public final synchronized static void main(String args[])
//public final synchronized static void main(String... args)


