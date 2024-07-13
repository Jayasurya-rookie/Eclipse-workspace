package com.kodnest.cc;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int a[]= {2,3,7};
		int target=9;
		HashMap hs = new HashMap<>();
		 for (int i =0;i<a.length;i++) {
			 int com =target-a[i];
			 if(hs.containsKey(com)) {
//				 Integer integer = hs.get(com);
				 System.out.println(i+" "+i);
			 }
			 
			 
		 }
		
		

}
}

//
//String str ="1 2 3 4";
//String[] split=str.split(" ");
//int[]a=new int[split.length];
//for(int i=0;i<split.length;i++) {
//	int x =Integer.parseInt(split[i]);
//	a[i]=x;
//}
//for (int i=0;i<split.length;i++) {
//	System.out.println(a[i]);
//	
//}
////