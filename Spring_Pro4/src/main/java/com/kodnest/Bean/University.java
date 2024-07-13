package com.kodnest.Bean;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	int uid;
	String uname;
	@Autowired
	Trainer t;
	public University() {
		super();
		System.out.println("0-Parameterised Constructor");

	
	}
	public University(int uid, String uname, Trainer t) {
		super();
		System.out.println("Parameterised Constructor");

		this.uid = uid;
		this.uname = uname;
		this.t = t;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
		System.out.println("Stter UID");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("setter uname university");
	}
	public Trainer getT() {
		return t;
	}
	public void setT(Trainer t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", t=" + t + "]";
	}
	

}
