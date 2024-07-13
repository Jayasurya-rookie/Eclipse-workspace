package com.kodnest.cc;

class Student extends Object{// every class belongs to object class
	int age;
	String name;
	public Student(int age, String name) {
		this.age=age;
		this.name=name;
	}
//	//override
//	public String toString() {
//		return name+" "+age;
//	}
//	public String toString1() {
//		return super.toString();
//	
//	}
	public String toString2() {
		return "Student{name:"+name+"age: "+age+" }";
	}
	
	
}


public class Stud {

	public static void main(String[] args) {
		Student s = new Student(10,"john");
		System.out.println(s);//output hashcode unique one
		
	

	}

}
