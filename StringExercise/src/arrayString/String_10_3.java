package arrayString;

public class String_10_3 {

	public static void main(String[] args) {
		String emp = " ";
		String str = "Hello";
		String str1 = "Hello";
		String str2= "Hello";
		
		for(int i =0; i<str.length();i++) {
			emp = emp+str.charAt(i);
		}
		for(int i =0; i<str.length();i++) {
			emp = emp+str1.charAt(i);
		}
		for(int i =0; i<str.length();i++) {
			emp = emp+str2.charAt(i);
			
		}
		System.out.println(emp);

		
		

	
	

	}

}
