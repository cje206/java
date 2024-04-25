package java_abstract;

public class Circle extends Shape {
	private double radius;
	
	public Circle(String color, double radius) {
		super("Circle", color);
		this.radius = radius;
	}
	
	public double calculateArea() {
		return (double)radius * radius * Math.PI;
	}

}
