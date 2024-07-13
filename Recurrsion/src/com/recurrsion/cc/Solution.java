package com.recurrsion.cc;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		System.out.println("use plx enter one int value: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		//int result =(a,b);
		//System.out.println(result);
	}
	static void  multiple(int n, int i ) {
		if(i>10) {
			return;
		}
		else {
			System.out.println(n + "*" + i + "=" +(n*i));
			multiple(n,i+1);
		}
		
		
		
	}
	
	
	  
		  
		
		}
//
//public static int factorial(int n){ 
//	  int count=0;
//	  System.out.println(count);
//	  if((n==0)||(n==1)){
//		  return n;
//	  }else {
//		  count++;
//		  System.out.println("count>>" + count);
//		  return n* factorial(n-1);
//	  }
//	  
//	  }
	

             
        
