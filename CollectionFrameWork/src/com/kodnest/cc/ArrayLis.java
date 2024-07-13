package com.kodnest.cc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ArrayLis {
	public static void main(String[]args) {
		

	
	ArrayList al = new ArrayList();
	al.add(5);
	al.add(4);
	al.add(3);
	al.add(2);
	al.add(1);
	al.add(1);
	al.add(null);
	al.add("sr");
	System.out.println(al);
	System.out.println("for loop");
	for(int i=0;i<al.size();i++) {
		System.out.print(al.get(i)+" ");
	}
	System.out.println();
	System.out.println("for each");
	for(Object object:al) {
		System.out.print(object+" ");
	}
	System.out.println();
	System.out.println("iterator");
	Iterator i = al.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+" ");
	}
	
	

	}

}
