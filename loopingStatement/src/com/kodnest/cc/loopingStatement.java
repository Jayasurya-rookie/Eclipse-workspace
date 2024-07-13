/*
 * WAJP TO PRINT THE EVEN NUMBERS USING FOR LOOP
 */

package com.kodnest.cc;
import java.util.Scanner;

public class loopingStatement {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("user plx eneter one n value: ");
		int n = scan.nextInt();
		//System.out.println("the even number for entered n values is ");
		scan.close();
		
		for (int i =1;i<=n;i++) {
			if(i==4) {
				//System.out.println(i);
				//break;//
				//continue;//skipping current iterration no 4
				return;
			}
			else {
				System.out.println(i);
			}
			
		}

	

	}

}
