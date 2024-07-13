
public class Stack {
	int a[]= new int[10];
	
	int tos=-1;//top of stack index value
//	
//	Stack(){
//		tos=-
//		
//	}
	void push(int item) {
		if(tos==9) {
			System.out.println("Stack is full");
		}
		else {
			a[++tos]=item;
		}
		
	}
	int pop() 
	{
		if(tos>=0) {
		return a[tos--];
	}
	else {
		System.out.println("STack is empty");
		return -1;
	}
		
	}
	

}
