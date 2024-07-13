package arrayString;

public class StringRepeat {

	public static void main(String[] args) {
		String str = "ABCDA";
		char charCount[]= new char[256];
		
		
		for(int i =0; i<str.length();i++) {
			
			charCount[str.charAt(i)]++;
			//System.out.println(str.charAt(i));
			
		}
		// to find no repeating character
		for(int i =0; i<str.length();i++) {
			if(charCount[str.charAt(i)]==1) {
				System.out.println(str.charAt(i));
				break;
				
			}
		}
		// to find repeating character
		for(int i =0; i<str.length();i++) {
			if(charCount[str.charAt(i)]>1) {
				System.out.println(str.charAt(i));
				break;
				
			}
		}

		
		
		
		
		
		

	}

}
