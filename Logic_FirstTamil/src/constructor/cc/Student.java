package constructor.cc;

 class Student1 {
	String name;
	int rollno;
	int marks;
	
	 Student1(String name, int rollno, int marks) {
		 this.name=name;
		 this.rollno=rollno;
		 this.marks=marks;
		
	}
	 int marksTotal(int marks){
		 return marks;
		 
		 
	 }
	  void studentDetail(String name, int rollno, int marks) {
		 System.out.printf(name,rollno,marks);
		
	 }

}

public class Student{
	public static void main(String[]args) {
		Student1 stu = new Student1("surya", 9,100);
		stu.studentDetail("jai",3,100);
		
//		int a = 20;
//		System.out.println(stu.marksTotal(a));
	
		
	}
	
}
