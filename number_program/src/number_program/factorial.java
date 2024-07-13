package number_program;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER N value");
		int n,factorial =1;
		n= scan.nextInt();
		
		for(int i =1; i<=n;i++) {
			factorial = factorial *i;
		}
		System.out.println("factorial value is : " + factorial);
	

	}

}
