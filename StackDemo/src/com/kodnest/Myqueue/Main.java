package com.kodnest.Myqueue;

import java.util.ArrayList;
import java.util.Scanner;

class MyQueue{
	
	ArrayList<Integer> al= new ArrayList<Integer>();
	
	void enqueue(int ele) {
		
		al.add(ele);
		System.out.println("enqueued element in "+al);
	}
	
	void deque(int i) {
		if(al.size()!=0) {
			al.remove(i);
			System.out.println(al.remove(i)+"suucess removed from list");
			
		}
		else {
			System.out.println("deque is empty");
		}
		
	}
	void peek() {
		if(al.size()!=0) {
			al.get(0);
			System.out.println(" element present in list"+al.get(0));
			
		}
		else {
			System.out.println("deque is empty");
		}
		
	}
	
	void display() {
		System.out.println("mydqueue data list"+ al);
	}
	
}
public class Main {

	public static void main(String[] args) {
		
		MyQueue mq = new MyQueue();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("press 1 for add element in queue");
			System.out.println("press 2 for remove element");
			System.out.println("press 3 for peek the element");
			System.out.println("press 4 for display the queue data ");
			System.out.println("press 5 for exit");
			
			int option = scan.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("enter the element to add");
					int ele = scan.nextInt();
					mq.enqueue(ele);
					break;
				case 2:
					System.out.println("enter the index value to remove ele");
					int i = scan.nextInt();
					mq.deque(i);
					break;
				case 3:
					mq.peek();
					break;
				case 4:
					mq.display();
					break;
				case 5:
					System.out.println("------");
					System.exit(0);
					
					break;
				default:
					System.out.println("enter the valid num");
				
				
			}
			System.out.println("-----------------------");
			
		}
		
		
		
		
		

	}

}
