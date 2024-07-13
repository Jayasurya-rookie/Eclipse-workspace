/*
 * BITWISE OPERATOR, BOOLEAN OPERATOPR,
 * (AND &,OR |,EXOR ^,NOT ~)
 * 2's compliment to store negative numbers
 * (<<-LEFT SHIFT)'
 * (>>-RIGHT SHIFT)'
 * (>>>- RIGHT SHIFT WITH ZERO FILL)
 *  
 *  SHORT CIRCUIT LOGICAL OPERATOR(&&,||)
 */
package logicOperator;

public class bitwise_Operator {

	public static void main(String[] args) {
		int  a=9,b=12;
		
		System.out.println("a & b is " + (a&b));//AND OPERATOR
		System.out.println("a | b is " + (a|b));//OR OPERATOR
		System.out.println("a ^ b is " + (a^b));//EXOR OPERATOR
		System.out.println("a ~ b is " + (~a));// compliment operator or NOT OPERATOR
		System.out.println("a compound assignement is " + (a&=2));// compound assignment
		//BOOLEAN 
		
		boolean c=false,d=true;
		System.out.println("C & D is " + (c&d));// boolean operator
		int s=-5;
		System.out.println("compliment "+~s);// compliment
		
		int g =4;
		System.out.println(g<<1);
		System.out.println(g>>1);
		System.out.println(g>>>1);
		
		
		//SHORT CIRCUIT  
		int e=20;
		
		System.out.println( (e>10)&&(e<30));// && SHORT CIRCUIT LOGICAL operator
		
		System.out.println((e<10)||(e>30));// || SHORT CIRCUIT LOGICAL operator
		

	}

}
