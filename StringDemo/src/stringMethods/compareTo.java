package stringMethods;

public class compareTo {

	public static void main(String[] args) {
	 String s = "Hello";
	 String s1 = "hello";
	 System.out.println(s.compareTo(s1));//output is negative its show that 2nd 
	 //string has higher value according to UNICODE ASCII Table
	 
	 System.out.println(s.compareToIgnoreCase(s1));// output is 0
	 
	 

	}

}
