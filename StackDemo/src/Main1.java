import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Stack;

 class MyStack{
	
	 ArrayList<Integer> al =new ArrayList<Integer>();
	 
	 void push(int ele) {
		 al.add(ele);
		 System.out.println(al +"succesfully added one element");
	 }
	 void pop() {
		 al.remove(al.size()-1);
		 System.out.println(al.size()-1+"successfully removed");
		 
	 }
	 
	 void peek() {
		 
		 System.out.println(al.get(al.size()-1)+" peek method");
	 }
	 void display() {
		 System.out.println(al);
	 }
}


public class Main1 {

	public static void main(String[] args) {
		MyStack st = new MyStack();
		
		System.out.println("enter the ele to store in arraylist");
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("press 1 for push()");
			System.out.println("press 2 for pop()");
			System.out.println("press 3 for peek()");
			System.out.println("press 4 to display stack");
			System.out.println("press 5 for exit");
			
		
		int option=s.nextInt();
		switch(option){
			case 1:
				System.out.println("enter ele to add ");
				int ele = s.nextInt();
				st.push(ele);
				break;
			case 2:
				st.pop();
				break;
			case 3:
				st.peek();
				break;
			case 5:
				System.exit(0);
				break;
				
			case 4:
				st.display();
				break;
				
			default:
				System.out.println("invalid option");
				break;
				
		}
		
		
		}
		
	
		
		
		

	}

}
