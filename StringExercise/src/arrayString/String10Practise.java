package arrayString;
/*
 * COMPARE METHODS OF STRINGS
 */

public class String10Practise {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		boolean value = compareString(s1,s2);
		System.out.println(value);
		

	}
	public static boolean compareString(String s1, String s2) {
		for(int i =0; i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
		
	}

}
