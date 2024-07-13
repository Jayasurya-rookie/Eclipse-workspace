package arrayKodnesthomeWork;
import java.util.Scanner;
public class rotationaOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array");
		
		int n = scan.nextInt();
		
		int a[]=new int[n];
		//
		System.out.println("enter the element of size "+ n);
		for(int i =0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		//display the elements
		System.out.println("The elements are ");
		for(int i=0;i<n;i++) {
				System.out.println(a[i]);
		}
		//display in rotate
		for (int i =0;i<n;i=i++) {
			int k =2;
			int j=0;
			int temp[]=new int[n];
			temp[j]=a[(i+k)%n];
		}
}
		

}


