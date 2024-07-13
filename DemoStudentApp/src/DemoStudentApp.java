
public class DemoStudentApp {
	 public class Student{
			String name;
			int id;
			void study() {
				System.out.println("studying");
			}
			void sleep() {
				System.out.println("sleeping");
			}
			void eat() {
				System.out.println("eating");
			}
		}

	

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name="jaya";
		System.out.println(s.name);
		s.id=400;
		System.out.println(s.id);
		s.study();
		s.sleep();
		s.eat();
		
	}
	
			
	
}
