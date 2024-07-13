package arrayString;
import java.util.Scanner;

public class SwapTwoString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("USER PLX ENTER ONE STRING VALUE: ");
		//String s = scan.nextLine();
		String s ="Hello Java";
		char[]ch = s.toCharArray();
		int left = 0;
		int right = ch.length-1;
		//SWAPPING
		while(left<right) {
		if(ch[left] !=' '&& ch[right] !=' ') {
			char temp = ch[left];
			ch[left]=ch[right];
			ch[right]= temp;
			left++;
			right--;
		}
//		else if(ch[left]==' ') {
//			left++;
//		}else if (ch[right]==' ') {
//			right--;
//		}


	}
		System.out.println(new String(ch));

}
}
