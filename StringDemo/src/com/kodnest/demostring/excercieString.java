package com.kodnest.demostring;

public class excercieString {

	public static void main(String[] args) {
		String s ="program";
		System.out.println("****************");
		System.out.println("ALL INDEX CHARACTER of PROGRAM STRING ARE: ");
		for(int i =0;i<s.length();i++) {
			
				System.out.println(s.charAt(i));
			
		}
		System.out.println("****************");
		System.out.println("EVEN INDEX CHARACTER of PROGRAM STRING ARE: ");
		for(int i =0;i<s.length();i++) {
			if(i%2==0) {
				System.out.println(s.charAt(i));
			}
		
		}
		System.out.println("****************");
		System.out.println("ODD INDEX CHARACTER of PROGRAM STRING ARE: ");
		for(int i =0;i<s.length();i++) {
			if(i%2==1) {
				System.out.println(s.charAt(i));
			}
		}
		System.out.println("****************");
		System.out.println("index divisible by 3& 2: ");
		for(int i =0;i<s.length();i++) {
			if((i%3==0)&&(i%2==0)) {
				System.out.println(s.charAt(i));
			}
		}

	}

}
