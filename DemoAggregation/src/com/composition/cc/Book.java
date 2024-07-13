package com.composition.cc;

public class Book {
	//String name;
	Page page;
	
	public Book(String content) {
		this.page=new Page(content);
	}
	void readPage() {
		System.out.println("Reading the pages");
	}
	

}
