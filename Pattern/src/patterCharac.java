
public class patterCharac {

	public static void main(String[] args) {
		for(char i = 'A'; i<='D';i++) {
			for(char j ='A';j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------");
		for(char i = 'A'; i<='D';i++) {
			for(char j ='A';j<='D';j++) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------");
		for(int i =1; i<=4;i++) {
			for(int j =1;j<=4;j++) {
				System.out.print((char)(i+64) +" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("----------");
		for(int i =1; i<=4;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print((char)(j+64) +" ");
			}
			System.out.println(" ");
		}


	}

}
