package com.kodnest.cc;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue ad = new PriorityQueue();
		ad.add(5);
		ad.add(4);
		ad.add(3);
		ad.add(2);
		ad.add(1);
		ad.add(1);
//		ad.add(null);// null not permitted
//		ad.add("sr");
		System.out.println(ad);
//		System.out.println("for loop");
//		for(int i=0;i<ad.size();i++) {
//			System.out.print(ad.get(i)+" ");// for loop not support
//		}
		System.out.println();
		System.out.println("for each");
		for(Object ob:ad) {
			System.out.println(ob);
		}
		System.out.println();
		System.out.println("iteration");
		Iterator it = ad.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		

	}

}
