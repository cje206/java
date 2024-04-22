package Java_practice;

public class Practice1 {
	private int width;
	private int height;
//	static 변수 추가
	private static int COUNT = 0;
	
	public Practice1(int num) {
		this.width = num;
		COUNT++;
	}
	
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
	
//	static 메소드 추가
	public static int getCount() {
		return COUNT;
	}
}
