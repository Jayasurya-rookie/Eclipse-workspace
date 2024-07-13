package object_Oriented;
class Employee{
	String name;
	String emailid;
	double contactnum;
	double DOB;
	void sleep() {
		System.out.println("the employee is sleeping");
	}
	void working() {
		System.out.println("the employee is pretending like working");
	}

}
public class DemoEmployeeApp {
	public static void main (String []args) {
		Employee e = new Employee();
		e.name = "jayasurya";
		e.emailid = "jayasuryasenthil01@gmail.com";
		e.contactnum=6383757817.;
		e.DOB=03.022001;
		
		System.out.println(e.name );
		System.out.println(e.emailid);
		System.out.println(e.contactnum);
		System.out.println(e.DOB);
		e.sleep();
		e.working();
		
	}

}


