package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Employee;
//import com.kodnest.bean.Laptop;

public class App {
	public static void main(String[]args) {
		ClassPathXmlApplicationContext c = 
				new ClassPathXmlApplicationContext("application_contexts.xml");
		Employee s1 =(Employee) c.getBean("ss");
		System.out.println(s1);
	
	}
	
	

}
