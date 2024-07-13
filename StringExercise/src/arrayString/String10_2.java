package arrayString;

public class String10_2 {

	public static void main(String[] args) {
		String s = "Hello";
		int a[] = new int [256];
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			a[ch]++;  // its will store value by 1 in place of alphabets is present
		}
		
		for(int i =0; i<a.length;i++) {
			if(a[i]>0) {
				System.out.println("Character : "+(char)i+"="+a[i]);
				//System.out.println(s.charAt(1));
				
			}
		
		}
		// TODO Auto-generated method stub

	}

}
