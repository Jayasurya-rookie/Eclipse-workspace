/*
 * CONSTRUCTOR MEHTOD OBJECT ORIENTED PROGRAM
 */
package com.kodnest;

class Student{
	
	String name;
	int id;
	String place;
	char gender;
	double marks;
	long contact_number;
	public Student(String name,int id,String place,char gender,double marks,long contact_number) {
		name= name;//name=name in industries we use this standardization
		id =id;//id=id
		place=place;
		gender= gender;
		marks=marks;
		contact_number=contact_number;
		
	}
	
}

public class DemoConstructorApp {

	public static void main(String[] args) {
		
		Student n1 = new Student("JAYA",100,"KOREA",'M',123.1,123455);
	
		System.out.println(n1.name+"\n "+n1.id +" \n"+n1.place+" \n"+n1.gender+"\n "+n1.marks+" \n"+n1.contact_number);

		System.out.println("--------------😍---❤️-----------------");
		
		Student n=new Student("SURYA",100,"INDIA",'M',123.1,123455);
		System.out.println(n.name+" "+n.id +" "+n.place+" "+n.gender+" "+n.marks+" "+n.contact_number);
	

	}

}
