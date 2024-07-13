package frequency;
import java.util.Scanner;

public class World_String5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = scan.nextLine();
		String str = s.toLowerCase();

		for(int i =0;i<str.length();i++) {
			if((s.charAt(i)>0)&&(s.charAt(i)<10)) {
				int intcount =0;
				intcount++;
				System.out.println("int counts is :"+intcount);
			}
			if((s.charAt(i)>=65)&&(s.charAt(i)<=90)){
				int vowelscount =0;
				vowelscount++;
				System.out.print("vowels count is : "+vowelscount);
				
			}
		}
		

		
		
		
	

	}

}
//System.out.println(a.replace(" ","99"));--REPLACE METHOD (HELO WORLD)O/P -- (HELO99WORLD)




/*
 * REVERSE THE SENTENCE
 */
//String[]split = a.split(" ");
//for(int i =split.length-1;i>=0;i--) {
//	System.out.print(split[i]+" ");
//	
//}



/*
 * REVERSE
 */
//	int a[]=new int[s.length()];
//	
//	for(int i =0;i<s.length();i++) {
//		if(s.charAt(i)==32) {
//			a[i]=32;
//		}
//	}
//	int j =0;
//	for(int i=s.length()-1;i>=0;i--) {
//		if(s.charAt(i)!=32) {
//			if(a[i]!=32) {
//				a[i]=s.charAt(i);
//			}
//			else {
//				j++;
//				continue;
//			}
//		}
//		else {
//			continue;
//		}
//	}
//	for(int i =0;i<a.length;i++) {
//		System.out.print(a[i]);
//	}



