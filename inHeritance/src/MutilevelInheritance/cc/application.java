package MutilevelInheritance.cc;

public class application {

	public static void main(String[] args) {
	
		parent parent = new parent();
		childSon baby = new childSon();
		child dad = new child();
		System.out.println("----------------------------");
		//parent
		System.out.println(parent.parent);
		parent.parentskill();
		System.out.println("----------------------------");
		//baby class
		System.out.println(baby.id);
		baby.babySkill();
		System.out.println("----------------------------");
		// child class
		System.out.println(dad.dadprice);
		dad.dadskill();
	
		System.out.println("----------------------------");
		//Accessing dad class by baby
		System.out.println(baby.dadprice);
		baby.dadskill();
System.out.println("----------------------------");
		//Accessing parent class by child & dad
		System.out.println(dad.parent);
		System.out.println(baby.parent);
		baby.parentskill();
		dad.parentskill();
		

	}

}
