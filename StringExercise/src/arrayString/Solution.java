/*
 * ANAGRAMS OR NOT
 */

package arrayString;
import java.util.Arrays;

public class Solution {
	public static void main (String[]args) {
		String str1= "listen";
		String str2 ="silent";
		
		char[] charArray = str1.toCharArray();// string to character array conversion
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		String string1= new String(charArray);// character array to string conversion
		String string2= new String(charArray2);
		
		if(string1.equalsIgnoreCase(string2)) {
			System.out.println("anagrams");
		}
		else {
			System.out.println("Not anagrams");
		}
		
		for(int i =0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
		}
		
	
		
		
	}

}
