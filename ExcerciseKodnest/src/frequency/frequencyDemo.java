package frequency;

public class frequencyDemo {

	public static void main(String[] args) {
		String s ="program";
		//                                                                                   char ch ='';
		int count =0;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			for(int j =0;j<s.length();j++) {
				if(ch ==s.charAt(j)) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
