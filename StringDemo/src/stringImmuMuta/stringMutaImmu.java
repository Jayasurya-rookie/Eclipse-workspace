package stringImmuMuta;

public class stringMutaImmu {
	public static void main(String[] args) {
		//WAJP TO CREATE AND PRINT STRING IN REVERSE MANNER

		String s1="Program";
		String s2 ="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.print(s2);
		
	}

}




//WAJP TO TO REMOVE DUPLICATE VALUE
//
//		String s = "Program";
//		String s1 = "";
//		for(int i =0; i<s.length();i++) {
//			if(!(s1.contains(s.charAt(i)+""))) {
//				s1 = s1+s.charAt(i);
//		
//				
//			}
//			
//		}
//		System.out.println(s1);



//WAJP TO DISPLAY ALL METHODS
		//1 way
//		String s1 ="ranjith";
//		//2 way
//		String s2 = new String ("susmitha");
//		//3 way
//		char c []= {'r','a','n','j','i','t','h'};
//		String s3 = new String(c);
//		// 4 way
//		StringBuilder s4 = new StringBuilder("super");
//		//5 way
//		StringBuffer s5 = new StringBuffer("super");
//		System.out.println(s1+" "+s2+" "+s3+" "+s4+ " "+s5);
//		
//		