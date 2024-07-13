package com.kodnest.Bean;

public class Trainer {
	
	int id;
	String name;
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("SETTER ID TRAINER");
		this.id = id;
	}
	public String getName() {
		
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("SETTER NAME TRAINER");
	}
	public Trainer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Parameterised Constructor");
	}
	public Trainer() {
		super();
		System.out.println("0-Parameterised Constructor");

		// TODO Auto-generated constructor stub
	}

}
