package frequency;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter one string name: ");
		String s = scan.nextLine();
		String rev="";
		for(int i =s.length()-1;i>=0;i--) {
			rev = rev +s.charAt(i);
			
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			System.out.println("pali");
		}
		else {
			System.out.println("not pali");
		}

		
		// TODO Auto-generated method stub

	}

}
