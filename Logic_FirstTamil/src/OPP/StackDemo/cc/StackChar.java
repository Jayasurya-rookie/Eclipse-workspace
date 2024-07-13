package OPP.StackDemo.cc;

public class StackChar {
	char a[]=new char[25];
	int tos=-1;
	
	void push(char item) {
		if(tos>25) {
			System.out.println("Stack is full");
			
		}
		else {
			a[++tos]=item;
		}
		
	}
	char pop() {
		if(tos>=0) {
			return a[tos--];
		}
		else {
			System.out.println("Stack is empty");
			return 'v';
		}
	}

}
