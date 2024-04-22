package java_abstract;

public class ShapeEx {

	public static void main(String[] args) {
		Shape circle = new Circle("Red", 5);
		Shape rect = new Rectangle("Blue", 3, 8);

		circle.print();
		rect.print();
		

	}

}
