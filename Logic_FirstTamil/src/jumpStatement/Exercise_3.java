package jumpStatement;
/*
 * PRINT PATTERN USING CONTINUE
 */

public class Exercise_3 {

	public static void main(String[] args) {
		for(int i =1; i<=5;i++) {
			for (int j =1;j<=5;j++) {
				
				if((i==4) &&(j==5) ){
					continue;
					
				}
				if((i==4) &&(j==4) ){
					continue;
					
				}
				if((i==4) &&(j==3) ){
					continue;
					
				}
				if((i==4) &&(j==2) ){
					continue;
					
				}
				//3 row
				if((i==3) &&(j==5) ){
					continue;
					
				}
				if((i==3) &&(j==4) ){
					continue;
					
				}
				//2 ROW 
				if((i==2) &&(j==5) ){
					continue;
					
				}
				if((i==2) &&(j==4) ){
					continue;
					
				}
				if((i==2) &&(j==3) ){
					continue;
					
				}
				if((i==2) &&(j==2) ){
					continue;
					
				}
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
