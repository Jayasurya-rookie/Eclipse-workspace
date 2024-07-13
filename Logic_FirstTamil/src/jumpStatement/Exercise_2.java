package jumpStatement;
/*
 * PRINT ALL THE NUM LESS THAN 100 EXCEPT NUMBERS DIVIDE BY 4 &6 USING CONTINUE
 */
import java.util.Scanner;
public class Exercise_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		outerLoop:
		for(int i=1; i<100;i++) {
			innerLoop:
			if(i%4==0|| i%6==0) {
				continue outerLoop;
			}
			else {
				System.out.println(i);
			}
		}
		
	

	}

}
