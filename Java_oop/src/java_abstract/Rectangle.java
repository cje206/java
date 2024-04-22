package java_abstract;

public class Rectangle  extends Shape {
	private int width;
	private int height;
	
	public Rectangle(String color, int width, int height) {
		super("Circle", color);
		this.width = width;
		this.height = height;
	}
	
	public double calculateArea() {
		return (double)width * height;
	}
}
