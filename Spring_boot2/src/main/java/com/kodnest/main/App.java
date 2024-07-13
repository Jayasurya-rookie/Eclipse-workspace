package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;


public class App {
	public static void main(String[]args) {

		ClassPathXmlApplicationContext c = 
				new ClassPathXmlApplicationContext("application_context.xml");
		Laptop s1 =(Laptop) c.getBean("l1");
		System.out.println(s1);
		Laptop s2 =(Laptop) c.getBean("l2");
		System.out.println(s2);
//		Laptop s3 =(Laptop) c.getBean("l3");
//		System.out.println(s3);
	}

}
