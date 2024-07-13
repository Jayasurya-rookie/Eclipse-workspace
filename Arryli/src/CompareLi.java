import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		
		return id+"-"+name;
	}

}
//class Sorting implements 

public class CompareLi {

	public static void main(String[] args) {
		Student s1 = new Student(10,"c");
		Student s2 = new Student(49, "j");
		Student s3= new Student(30, "v");
		Student s4= new Student(40, "a");
		Student s5= new Student(50, "u");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println(al);
		Collections.sort(al,new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.id>o2.id) {
					return 1;
					
				}else if(o1.id<o2.id) {
					return -1;
				}
				return 0;
			}
			

		}
);
		System.out.println(al);

}
}



//@Override
//public int compare(Student o1, Student o2) {
//	if(o1.name.compareTo(o2.name)>0) {
//		return 1;
//		
//	}else if(o1.name.compareTo(o2.name)<0) {
//		return -1;
//	}
//
//
//	
//	return 0;
//}
