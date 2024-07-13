package mehtodInvoking.cc;

class Box{
	int length;
	int breath;
	int heigth;
	int surfaceArea() {
		return 2*(length*breath*heigth);
	}
}

public class methodInvoking {
	public static void main(String[]agrs) {
		Box white = new Box();
		white.length=2;
		white.breath=2;
		white.heigth=2;
		
		System.out.println("White surface area is "+white.surfaceArea());
		
	}

}
