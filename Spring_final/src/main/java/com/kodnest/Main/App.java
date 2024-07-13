package com.kodnest.Main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.Bean.Employee;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext con = 
				new ClassPathXmlApplicationContext("application_con.xml");
		Employee l1= (Employee) con.getBean("ss");
		System.out.println(l1);

		

	}

}
