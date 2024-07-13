package logic_Code;


public class Methods {
	public static void main(String []args) {
		System.out.println("hello");
		int volume = boxVolume(1,2,3);
		System.out.println(volume);
	
				
		
	}
	static int boxVolume(int length, int breadth , int height) {//method definition
		int vol;
		 vol = length * breadth * height;
		return vol;
		
	}
	


}
