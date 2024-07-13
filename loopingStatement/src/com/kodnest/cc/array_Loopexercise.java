package com.kodnest.cc;
import java.util.Scanner;

public class array_Loopexercise {

	public static void main(String[] args) {
		int a[]= {10,17,40,14,30};
		boolean flag=false;
		for(int i =0;i<=a.length;i++) {
			if(a[i]==14) {
				flag=true;break;	
			}
			else {
				flag=false;			
		    }
			
				
			}
		if(flag==true) {
			System.out.println("Element present");
			
		}
		else {
			System.out.println("absent");
		
		}
	
	


	}

}
