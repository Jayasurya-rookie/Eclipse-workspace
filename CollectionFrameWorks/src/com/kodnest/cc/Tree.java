package com.kodnest.cc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


public class Tree {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
	
		al.add(10);
		al.add(30);
		al.add(50);
		al.add(50);
		al.add(59);
		System.out.println(al);
		TreeSet ts = new TreeSet(al);// Duplicates not allowed// use collection class sort method to not loss duplicate values
		System.out.println(ts);
		Collections.sort(al);
		System.out.println(al);// its retian duplicates too
		

	}

}

