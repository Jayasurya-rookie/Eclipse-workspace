package com.kodnest.cc;

public class child extends parent{
	int a=20;
	void display() {
		System.out.println("2");
		//this.display();
		super.display();
		this.display1();
	}
	void display1() {
		System.out.println("3");
	}
//	void display1(){
//		System.out.println("4");
//	}
	
	
	
	

	


}


//System.out.println(a);
//System.out.println(this.a);//this represent same class instance variable will be display
//System.out.println(super.a);// super class will display parent class
//System.out.println(a);
//System.out.println("-----");
