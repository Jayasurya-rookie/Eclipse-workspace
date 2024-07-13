/*
 * GET AN INPUT NUMBER FROM USER AND PRINT A PYRAMID USING THAT NUMBER
 */

package logicFirstTamil.com;
import java.util.Scanner;

public class assignment_Logic {
	public static void main(String []agrs) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter one num");
		int pyramid = scanner.nextInt();
		
		System.out.println("     "+pyramid +"");
		System.out.println("   " +pyramid +" "+ pyramid+ " "+ pyramid);
		System.out.println("  "+pyramid +" "+pyramid+" "+pyramid+" " +pyramid +" "+ pyramid +" " );
		System.out.println(pyramid + " " +pyramid+ " " +pyramid+ " "+pyramid+" "+pyramid +" "+ pyramid +" "+ pyramid);
		
		
	}
	

}
