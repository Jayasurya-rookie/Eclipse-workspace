package arrayKodnesthomeWork;
/*
 * DISPLAY IN REVERSE ORDER
 * REPLACE POSITIVE ELEMENTS WITH EQUIVALENT NEGATIVE ELEMENTS
 * FIND THE SMALLEST
 * FIND THE LARGEST
 * GENERATE SUB ARRAY 
 */
import java.util.Scanner;
import java.util.Arrays;

public class reverse_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("use plx enter the size of an arry");
		int n = scan.nextInt();
		int a[]= new int[n];
		System.out.println("User plx the elements for size: "+ n);
		for(int i =0;i<a.length;i++) {
			a[i]=scan.nextInt();
			
		}
//		System.out.println("the reverse order of given: ");
//		for(int i =a.length-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
//		}
			//REPLACE POSTIVE WITH NEGATIVE VALUE	
		//replacePositive(a);
		
		
		
		//smallest element& large element
		Arrays.sort(a);
		System.out.println("min element "+ a[0]);
		System.out.println("max element "+ a[n-1]);

	

	}
	
//	public static void replacePositive(int []a) {
//		System.out.println("The negative of given elements are: ");
//		for(int i =0;i<a.length;i++) {
//			if(a[i]>0) {
//				a[i]=-a[i];
//				System.out.print(a[i]);
//			}
//			else {
//				System.out.print(a[i]);
//			}	
//		}	
//	}

	
}
