package java_abstract;

public class Car extends Vehicle {
	
	public Car(String name) {
		super(name);
	}

//	추상 메소드 구현
	public void start() {
		System.out.println(super.getName() + " 자동차가 출발합니다.");
	}
}
