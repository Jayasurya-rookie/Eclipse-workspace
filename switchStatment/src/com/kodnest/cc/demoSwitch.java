/*
 * WJP TO DISPLAY THE WEEK DAYS USING SWITCH STATMENT
 */
package com.kodnest.cc;//byte,short,integer, char, Strings values only permitted

import java.util.Scanner;//Double, float,long are not permitted

public class demoSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day number");
		String day_no = scan.nextLine();
		
		switch(day_no) {
		case "e":System.out.println("Sunday");break;
		case "d":System.out.println("Monday");break;
//		case 3:System.out.println("Tuesday");break;
//		case 4:System.out.println("Wednesday");break;
//		case 5:System.out.println("Thursday");break;
//		case 6:System.out.println("Friday");break;
//		case 7:System.out.println("Saturday");break;
		default:System.out.println("Invalid day");
			
		
		}
		scan.close();
		

	}

}
