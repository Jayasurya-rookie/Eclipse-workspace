
public class number_2 {

	public static void main(String[] args) {
		System.out.println("----------");
		for(int i =10; i<=40;i=i+10) {
			for (int j=10; j<=i;j=j+10) {
				System.out.print(""+ j+" " );
			}
			System.out.println("  ");
		}
		System.out.println("----------");
		for(int i =10; i<=40;i=i+10) {
			for (int j=10; j<=i;j=j+10) {
				System.out.print( j);
				
				System.out.print("*");
			}
			System.out.println("  ");
		}
		System.out.println("other way to print");
		System.out.println("----------");
		for(int i =1; i<=4;i++) {
			for (int j=1; j<=i;j++) {
				System.out.print( " " +j*10 );
			}
			System.out.println("  ");
		}
		System.out.println("other way to print");
		System.out.println("----------");
		for(int i =1; i<=4;i++) {
			for (int j=1; j<=i;j++) {
				if(i==j) {
					System.out.print(j*10);
				}
				else {
					System.out.print(j*10 +"*");
				}
			}
			System.out.println("  ");
		}
	
	
		

	}

}
