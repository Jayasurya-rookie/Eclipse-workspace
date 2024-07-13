import java.util.ArrayList;
//import java.util.Stack;
//LIFA= Last In First Out//FIRST IN LAST OUT =FILO
//forming stack and queue data structure using array list 
//Array List = add, remove, get
//Stack= push(add), pop(remove), peek(get,size())

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
//		System.out.println(al.size());
//		System.out.println(al.size()-1);
//		System.out.println(al);
		System.out.println (al.get(al.size()-1));// configuring peek method in array list using get method
	}
}
