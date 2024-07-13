package com.kodnest.cc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		al.add("apple");
		al.add("banana");
		al.add("apple");
		al.add("grape");
		al.add("apple");
		
		for(String str:al) {
			
			if(hm.containsKey(str)) {
				hm.put(str, hm.get(str)+1);
			}
			else {
				hm.put(str, 1);
			}
//			if(!(hm.containsKey(str))){
//				hm.put(str,1);
//				
//			}
//			else {
//				hm.put(str, hm.get(str)+1);
//			}
		}
	
		System.out.println(hm);
		
		
		
//		System.out.println(al);
		
//		HashSet<String> hs = new HashSet<String>();
//		hs.add("apple");
//		hs.add("banana");
//		hs.add("apple");
//		hs.add("grape");
//		hs.add("apple");
//		System.out.println(hs);
		
//		new HashMap


	}

}
