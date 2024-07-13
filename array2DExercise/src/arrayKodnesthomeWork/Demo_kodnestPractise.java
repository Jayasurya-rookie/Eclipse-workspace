package arrayKodnesthomeWork;
import java.util.Scanner;
public class Demo_kodnestPractise {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("use plx enter the size of an arry");
		int n = scan.nextInt();
		
		createArray(n);
		scan.close();
	}
	static void createArray(int n) {
		Scanner scan = new Scanner(System.in);
		int arr[]=new int [n];
		System.out.println("use enter array elements for size "+ n);
		for(int i =0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("the array elements are : ");
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
