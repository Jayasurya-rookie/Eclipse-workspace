package arrayString;
/*
 * WAJP TO FIND OUT NON REPeATING CHARACTER IN GIVEN STRING
 */

public class nonRepeating {

	public static void main(String[] args) {
		String str = "program";
		for(int i =0;i<str.length();i++) {
			String ch = str.charAt(i)+" ";// "" this it will consider as character datatype
			
			if(str.substring(i+1).contains(ch)) {
				//System.out.println(ch);
				continue;
			}
			else {
				System.out.println(ch);
				break;
				
			}
			
		}
		
		// TODO Auto-generated method stub

	}

}
