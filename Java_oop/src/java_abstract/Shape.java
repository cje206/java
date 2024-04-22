package java_abstract;

public abstract class Shape {
	private String color;
	private String type;
	
	public Shape(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	public String getColor() {
		return color;
	}

	public abstract double calculateArea();
	
	public void print() {
		System.out.printf("=== %s 도형의 정보 ===", type).println();
		System.out.println("도형의 색상: " + color);
		System.out.println("도형의 넓이: " + calculateArea());
	}

}
