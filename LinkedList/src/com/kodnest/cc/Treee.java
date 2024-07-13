package com.kodnest.cc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;
//import java.util.TreeSet;

public class Treee {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al.get(0));
		
		System.out.println("for loop");

		for(int i =0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("while loop");
//		System.out.println();

		int i=0;	while(i<al.size()) {
			System.out.print(al.get(i)+" ");
			i++;
		}
		System.out.println();
		System.out.println("do while");
		
		int j=0;
		do {
			System.out.print(al.get(j)+" ");
			j++;
		}while(j<al.size());
		
//		Object[] x = 1;
		System.out.println();
		System.out.println("using for each loop");
		for(Object k:al) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("using iteration ");
		java.util.Iterator it =al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		TreeSet l = new TreeSet();
//		l.add(30);
//		l.add(40);
//		l.add(10);
//		l.add(50);
//		l.add(78);
//		l.add(56);
//	
//		System.out.println(l);
//		System.out.println(l.first());
//		System.out.println(l.last());
		
//		System.out.println(l);
//		System.out.println(l.first);
//		System.out.println();

	
		
//
		
		
		

		
		
		
		
		
		
//		System.out.println(al);
		
		
		// TODO Auto-generated method stub

	}

}


//TreeSet ts=new TreeSet();//Sorting element in ascending order
//ts.add("john");
//ts.add("johnny");
//ts.add("suresh");
//		System.out.println(ts);