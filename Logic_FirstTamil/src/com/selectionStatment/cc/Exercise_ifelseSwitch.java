/*
 * PRINT DAYS OF THE WEEK USING SWITCH STATEMENT 
 * 
 */
package com.selectionStatment.cc;
import java.util.Scanner;

public class Exercise_ifelseSwitch {

	public static void main(String[] args) {
		Scanner scam = new Scanner(System.in);
		System.out.println("Enter one lower case alphabets from a - z: ");
		String a =scam.nextLine();
		switch(a) {
		case "a":
			System.out.println("sounds good its vowels");break;
		case "e":
			System.out.println("sounds good its vowels");break;
		case "i":
			System.out.println("sounds good its vowels");break;
		case "o":
			System.out.println("sounds good its vowels");break;
		case "u":
			System.out.println("sounds good its vowels");break;
			
		default:
			System.out.println("its consonants");	
		
		}
		
		
		System.out.println("ENTER A INTEGER FROM 1-7: ");
		int weekdays = scam.nextInt();
		switch(weekdays){
		case 1:
			System.out.println("MONDAY");break;
		case 2:
			System.out.println("TUESDAY");break;	
		case 3:
			System.out.println("WEDNESDAY");break;
		case 4:
			System.out.println("THURSDAY");break;
		case 5:
			System.out.println("FRIDAY");break;
		case 6:
			System.out.println("SATURDAY");break;
		case 7:
			System.out.println("SUNDAY");break;
		default:
			System.out.println("Shut the fu##k Off Enter correct value man");
			
		}
		scam.close();


	}

}
