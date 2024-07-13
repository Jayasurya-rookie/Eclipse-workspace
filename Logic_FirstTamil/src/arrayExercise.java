import java.util.Scanner;
public class arrayExercise {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("use enter row size : ");
//		int row = scan.nextInt();
//		System.out.println("use enter column size");
//		int colu = scan.nextInt();
		int a[][] = {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
		};
		int sum=0;
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<=i;j++) {
				sum = sum+a[i][j];
			}
		}
		System.out.println(sum);
	}

}
