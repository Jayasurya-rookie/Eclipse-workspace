package com.kodnest.hash;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<Integer, String>();
		hashMap.put(1,"java ");
		hashMap.put(2,"SQL ");
		hashMap.put(6,"HTML ");
		hashMap.put(4,"CSS ");
		hashMap.put(3,"java ");
		System.out.println(hashMap);
		for (int i=0;i<hashMap.size();i++) {
			System.out.println(hashMap.get(i));
			
		}
	

	}

}
