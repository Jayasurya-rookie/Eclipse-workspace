package objectOriented_java;
class Student{
	String name;
	int id;
	void sleep() {
		System.out.println("sleep");
		
	}
	void eat() {
		System.out.println("eating");
		
	}
	void study() {
		System.out.println("studying");
		
	}
	

}

public class DemoStudentApp {

	public static void main(String[] args) {
		Student s=new Student();
		s.name="eshaal";
		s.id = 12334;
	
		
		System.out.println(s.name + s.id);
		s.study();
		s.eat();
		s.sleep();
		

	}

}
