package java_abstract;

public class Circle extends Shape {
	private int radius;
	
	public Circle(String color, int radius) {
		super("Circle", color);
		this.radius = radius;
	}
	
	public double calculateArea() {
		return (double)radius * radius * Math.PI;
	}

}
