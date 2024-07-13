package jumpStatement;
import java.util.Scanner;
/*
 * PRINT THE NEAR  OR Equal VALUE OF INPUT ITS DIVISBLE BY 10 
 */
public class loopcontroldemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter one value: ");
		double n , sum=0.0;
		//n = scan.nextDouble();
		while(true) {
			n = scan.nextDouble();
			
			if(n<0.0) {
				
				break;
			}
			sum+=n;
			//System.out.println("sum is " + sum);
			
		}
		System.out.println("sum is " + sum);
		
		
		

	}

}


/*int n;
n = scan.nextInt();
while(n>0) {
	if(n%10==0) {
		System.out.println(n);
		break;
	}
	n--;
	
}
 * 
 */

