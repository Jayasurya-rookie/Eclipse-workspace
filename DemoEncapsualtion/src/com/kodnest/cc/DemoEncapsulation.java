package com.kodnest.cc;

public class DemoEncapsulation {
	//hide the data
	private String name;
	private int age;

	
	//setter methods
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	

	
}


