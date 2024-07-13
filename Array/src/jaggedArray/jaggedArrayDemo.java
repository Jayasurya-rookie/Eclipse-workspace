package jaggedArray;

public class jaggedArrayDemo {

	public static void main(String[] args) {
		int [][][]d= new int [3][][];//School size only given
		//1st School
		d[0]= new int[2][];//in 1st school there is two classes but students is unknown ;(
		d[0][0]=new int [4];
		d[0][1]=new int[3];
		
		//2nd School
		d[1]= new int[2][];//in 2nd school there is two classes but students is unknown ;(
		d[1][0]=new int [2];
		d[1][1]=new int[3];
		
		//3 rd school
		
		d[2]= new int[3][];//in 3rd school there is three classes but students is unknown ;(
		d[2][0]=new int [4];
		d[2][1]=new int[2];
		d[2][2]=new int[2];
		
		for (int i =0;i<d.length;i++) {
			for(int j =0;j<d[i].length;j++) {
				for(int k=0;k< d[i][j].length;k++) {
					d[i][j][k]=5;
				}
			}
		}
		for (int i =0;i<d.length;i++) {
			for(int j =0;j<d[i].length;j++) {
				for(int k=0;k< d[i][j].length;k++) {
					System.out.print(d[i][j][k] + " ");
				}
			}
		}
		
		

	}

}
