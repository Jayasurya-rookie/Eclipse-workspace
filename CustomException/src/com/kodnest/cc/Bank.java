package com.kodnest.cc;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the amount to widthdraw ");
		int amount = scan.nextInt();
		
		try {
			withdraw(amount);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	static void withdraw(int amount) throws MyException {// exception throws to line 12 method call
		int balance=1000;
		if(amount>balance) {
			throw new MyException();// connecting to my exception and throw the exception to method
		}
	}

}
class MyException extends Exception{
	public MyException(){
		super("Insufficeint funds, try enter avaible amount");
		
	}
}