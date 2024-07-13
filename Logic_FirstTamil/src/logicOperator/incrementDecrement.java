package logicOperator;

public class incrementDecrement {
	public static void main(String []args) {
		int a =3,b=4,c;
		c = (a+b)+ (a++) + (b++) + (++a) + (++b);
		System.out.println("c is " +c);
		
		//SWAP THE VALUES USING BTW TWO VARIABLES WITHOUT USING THIRD VARIABLES
		//EXOR METHOD BY FOLLOWING FORMULA (a^b)^b =a.....(a^b)^a =b;
		int f=20,g=30;
		
		System.out.println("f value is " +((g^g)^g));
		System.out.println("g value is " +((f^f)^f));
		
	}

}
