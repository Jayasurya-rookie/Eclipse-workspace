package com.kodnest.alpha;

public class alphabet_W {

	public static void main(String[] args) {
		for(int i =1; i<=11; i++) {
			for(int j =1; j<=11;j++) {
				if(j==1||i+j==7 ||i-j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");//space is important
				}
			}
			System.out.println( );
		}
	

	}

}
