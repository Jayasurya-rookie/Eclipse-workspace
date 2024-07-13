package failfast;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.add(20);
		s.add(302);
		s.add(76);
		System.out.println(s);
		
		Vector v = new Vector();
		v.add(32);
		v.add(76);
		v.add(8);
		System.out.println(v);
		
		Hashtable hs = new Hashtable();
		hs.put(1, 10);
		hs.put(3,90);
		System.out.println(hs);
		
		Properties p = new Properties();
		
		p.put(3, 2);
		p.put(4,8);
		System.out.println(p);
		
	
//		CopyOnWriteArrayList al =new CopyOnWriteArrayList();
//		LinkedList al = new LinkedList();
//		ArrayList al = new ArrayList();
//		al.add(20);
//		al.add(30);
//		al.add(40);
//		
//		Iterator it = al.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			al.add(99);
//			System.out.println(al);
//		}
//		System.out.println(al);
//	
//		for(Object o:al) {
//			System.out.println(o);
//			al.add(99);
//		}
//		
//		int i=0;
//		while(i<al.size()) {
//				System.out.println(al.get(i));
//				i++;
//				al.add(99);
//		}
//		for (int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			al.add(99);
//		}

	}

}
