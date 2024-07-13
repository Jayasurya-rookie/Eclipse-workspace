package OPP.StackDemo.cc;

public class Que {
	int a[]=new int[10];
	int loq=-1;
	
	void push(int item) {
		if(loq>9) {
			System.out.println("Queue is full");
		}
		else {
			a[++loq]=item;
		}
	}
//	@SuppressWarnings("unused")
	int pop() {
		if(loq>=0) {
			for(int i =0;i<a.length;) {
			
				return a[i];
				
			}
		}
		else {
			System.out.println("Stack empty");
			return -1;
		
		}
		return loq;
	}

}
