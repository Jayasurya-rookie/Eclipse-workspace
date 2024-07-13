
public class numpattern {

	public static void main(String[] args) {
		for(int i = 1;i<=4;i++) {
			for(int j =1; j<=4;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
		System.out.println("------------------");
		for(int i = 1;i<=4;i++) {
			for(int j =1; j<=4;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
			System.out.println("------------");
		}
		for(int i =1; i<=4;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
		System.out.println("4. questions answer");
		System.out.println("----------");
		for(int i =1; i<=4;i++) {
			for (int j=1; j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		System.out.println("----------");
		for(int i =10; i<=40;i=i+10) {
			for (int j=10; j<=i;j=j+10) {
				System.out.print( j );
			}
			System.out.println("  ");
		}
		
		

	}

}
