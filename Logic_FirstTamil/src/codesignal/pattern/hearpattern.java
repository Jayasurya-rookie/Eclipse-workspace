package codesignal.pattern;

public class hearpattern {

	public static void main(String[] args) {
		for(int i=10/2;i<=10;i=i+2) {
			for(int j=1;j<10-i;j=j+2) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=10-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
			
		}
		for(int i=10;i>=1;i--) {
			for(int j=i;j<10;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++) {
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	
		}


		

	}


