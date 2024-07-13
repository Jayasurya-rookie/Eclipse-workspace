package com.kodnest.entity;

import java.util.List;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Product {
	@Id
	int pid;
	public Product(int pid, String pname, List<Customer> customer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.customer = customer;
	}


	public Product() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", customer=" + customer + "]";
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public List<Customer> getCustomer() {
		return customer;
	}


	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}


	String pname;
	
	@ManyToMany
	List<Customer>customer;
	

//		
	
//	@OneToOne
//	customer customer;
	
	
//	public Product() {
//		super();
//		
//	}
//	public Product(int pid, String pname) {
//		super();
//		this.pid = pid;
//		this.pname = pname;
//	}
//	public int getPid() {
//		return pid;
//	}
//	public void setPid(int pid) {
//		this.pid = pid;
//	}
//	public String getPname() {
//		return pname;
//	}
//	public void setPname(String pname) {
//		this.pname = pname;
//	}
//	@Override
//	public String toString() {
//		return "Product [pid=" + pid + ", pname=" + pname + "]";
//	}
	

//	public Product() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Product(int pid, String pname, Customer c) {
//		super();
//		this.pid = pid;
//		this.pname = pname;
//		this.c = c;
//	}
//
//	public int getPid() {
//		return pid;
//	}
//
//	public void setPid(int pid) {
//		this.pid = pid;
//	}
//
//	public String getPname() {
//		return pname;
//	}
//
//	public void setPname(String pname) {
//		this.pname = pname;
//	}
//
//	public Customer getC() {
//		return c;
//	}
//
//	public void setC(Customer c) {
//		this.c = c;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [pid=" + pid + ", pname=" + pname + ", c=" + c + "]";
//	}

}
