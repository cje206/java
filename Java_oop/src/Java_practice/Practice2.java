package Java_practice;

// final실습 Circle클래스 만들기
public class Practice2 {
//	반지름 radius 필드
	private final double radius;
//	원주율 상수 선언
	private static final double PI = Math.PI;
	
//	생성자를 이용한 반지름 초기화
	public Practice2 (double radius) {
		this.radius = radius;
	}
	
//	원의 넓이를 계산하는 메소드
	public double calculateArea() {
		return PI * radius * radius;
	}
	
//	원의 반지름 가져오기 getter
	public double getRadius() {
		return radius;
	}
	

}
