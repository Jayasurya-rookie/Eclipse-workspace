package com.kodnest.cc;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLi {

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add(5);
		ls.add(4);
		ls.add(3);
		ls.add(2);
		ls.add(1);
		ls.add(1);
		ls.add(null);
		ls.add("sr");
		System.out.println(ls);
		System.out.println("for loop");
		for(int i=0;i<ls.size();i++) {
			System.out.print(ls.get(i)+" ");
		}
		System.out.println();
		System.out.println("for each");
		for(Object ob:ls) {
			System.out.println(ob);
		}
		System.out.println();
		System.out.println("iteration");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		

	}

}
