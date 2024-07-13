package com.kodnest.interfaces;

 interface Student {
	void sleep();
	void study();
	

}
 class Implemen implements Student{
	 public void sleep() {
		 System.out.println("Student is sleeping");
	 }
	 public void study() {
		 System.out.println("Student is stduying");
	 }
 }

public class StudentActivites {
	public static void main(String[] args) {
		Implemen css = new Implemen();
		
		css.study();
		css.sleep();
		
	}
	
	
	
}
