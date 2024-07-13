package last.pattern.cc;

public class combination_pattern {

	public static void main(String[] args) {
		//OUTERFORLOOP FOR 1 ST:
		for(int i =1;i<=5;i++) {
			for(int j =4;j>=i;j--) {
				System.out.print("-");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
			
		}
		//OUTERLOOP FOR 2nd:
		for(int i=1;i<=4;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("-");
			}
			for(int j =4;j>=i;j--) {
				System.out.print("*");
			}
			for(int j =3;j>=i;j--) {
				System.out.print("*");
			}
			
			System.out.println(" ");
			
		}
		

	}

}
