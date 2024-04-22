package Java_oop;

public class Rectangle {
	
	private int width;
	private int height;
	
//	직사각형 또는 정사각형
//	public Rectangle() {
//		this.width = 0;
//		this.height = 0;
//		this(0, 0);
//	}
	public Rectangle(int num) {
		this.width = num;
	}
//	public Rectangle(int w, int h) {
//		this.width = w;
//		this.height = h;
//	}
	
	public int area() {
		return width * height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

}
