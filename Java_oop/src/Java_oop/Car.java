package Java_oop;

public class Car {
	
//	멤버 변수(데이터, 변수, 필드)
	private int speed;
	
//	생성자
	public Car() {
		this.speed = 1;
	}
	public Car(int speed) {
		if(speed > 0 ) {
			this.speed = speed;
		}
	}
	
//	메소드
	public void start() {
		System.out.println("Engine Start");
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
////	getter
//	public int getSpeed() {
//		return speed;
//	}
//	
////	setter
//	public void setSpeed(int num) {
//		if(num < 0) {
//			this.speed = Math.abs(num); // 절대값
//		} else {
//			this.speed = num;
//		}
//	}

}
