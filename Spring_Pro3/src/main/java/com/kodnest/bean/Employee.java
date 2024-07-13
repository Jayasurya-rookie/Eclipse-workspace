package com.kodnest.bean;

import java.util.HashMap;
//import java.util.HashSet;

//import java.util.ArrayList;

public class Employee {
	HashMap<Integer,String> organisations;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(HashMap<Integer, String> organisations) {
		super();
		this.organisations = organisations;
	}

	public HashMap<Integer, String> getOrganisations() {
		return organisations;
	}

	public void setOrganisations(HashMap<Integer, String> organisations) {
		this.organisations = organisations;
	}

	@Override
	public String toString() {
		return "Employee [organisations=" + organisations + "]";
	}
	

	
	

}
