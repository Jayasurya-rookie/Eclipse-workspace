package ExceptionDemo;

public class Main {

	public static void main(String[] args) throws Exception {
		Task.method3();
	}
	
}
class Task extends Exception{
	static void method3() throws Exception{
		method1();
		
		
	 }


	 static void method1() throws Exception{
		 try {
			 System.out.println(2/0);
		 }catch(Exception e) {
			 System.out.println("handled  " +e);
		 }

		
	}
	

}