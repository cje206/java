package java_first;

public class Practice6 {

	//원의 넓이
	public double calc(double radius) {
		return Math.PI * radius * radius;
	}
	
	//직사각형 넓이
	public double calc(double w, double h) {
		return w * h;
	}
	
	//삼각형의 넓이
	double calc( double w, double h, boolean isT) {
		if( isT) {
			return w * h * 0.5;
		} else {
			return calc(w, h);
		}
	}
	

	public static void main(String[] args) {
		Practice6 prac = new Practice6();
		
		System.out.println("반지름 5인 원: " + prac.calc(5));
		System.out.println("가로4, 세로7 직사각형: " + prac.calc(4, 7));
		System.out.println("밑변6, 높이3 삼각형: " + prac.calc(6, 3, true));

	}

}
