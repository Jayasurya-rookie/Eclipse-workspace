package com.kodnest.cc;
import java.util.Scanner;
public class Student {
	public static void main(String[]args) {
		DemoEncapsulation s = new DemoEncapsulation();
		Scanner scan = new Scanner(System.in);
		System.out.println("plx enter ur name: ");
		String name = scan.nextLine();
		System.out.println("plx enter ur age: ");
		int age = scan.nextInt();
		
		//hero
		s.setName(name);
		s.setAge(age);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		//villian
//		System.out.println(s.getName());
//		System.out.println(s.getAge());

		
	}

}
