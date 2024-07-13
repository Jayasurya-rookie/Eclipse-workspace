package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.Bean.Trainer;
import com.kodnest.Bean.University;

public class App {
	public static void main(String[]args) {
		System.out.println("spring");
		
		ClassPathXmlApplicationContext c = 
				new ClassPathXmlApplicationContext("appli_context.xml");
		
		 Trainer t= (Trainer)c.getBean("t");
		 System.out.println(t);
		
		University u = (University)c.getBean("u1");
		System.out.println(u);
	}

}
