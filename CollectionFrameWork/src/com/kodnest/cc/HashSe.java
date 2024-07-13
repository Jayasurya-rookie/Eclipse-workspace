package com.kodnest.cc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSe {

	public static void main(String[] args) {
		HashSet ad = new HashSet();
		ad.add(5);
		ad.add(4);
		ad.add(3);
		ad.add(2);
		ad.add(1);
		ad.add(1);
		ad.add(null);// null not permitted
		ad.add("sr");//class cast exception no hetero
		System.out.println(ad);
		System.out.println("for loop");
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
