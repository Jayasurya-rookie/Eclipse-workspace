/*
 * PRIME NUMBER OUTPUT
 */
package jumpStatement;
import java.util.Scanner;
public class exercise_Logicforloop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER N value: ");
		int n,rem;
		int count =0;
		n = scan.nextInt();
		
		int i =1;
	
		while(i<=n) {
		
			rem = n%i;
			i++;

			if(rem==0) {
				
				count++;
			}	
		}
			if(count==2) {
				System.out.println("then given num is prime num " + n);
			}
			else {
				System.out.println("is not prime number");
			}
			
		

		
		
		
		
		
		
		
	}

}
