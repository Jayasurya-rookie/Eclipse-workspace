
 class Shape {
	 void draw() {
		 	System.out.println("Drwaing shape");
	 }

}
 class Rectangle extends Shape{
	 void draw() {
		 System.out.println("Drawing rectangle");
	 }
	 
 }
 class Circle extends Shape{
	 void draw() {
		 System.out.println("Drawing circle");
	 }
	 
 }
class DemoShape{
	public static void main(String[]args) {
		Shape shape = new Shape();
		shape.draw();
		Rectangle rec = new Rectangle();
		rec.draw();
		Circle cir = new Circle();
		cir.draw();
	}
}