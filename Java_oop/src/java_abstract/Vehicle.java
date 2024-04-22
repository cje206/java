package java_abstract;

// 추상 클래스
// 멤버변수 할당 가능
// 일반 메소드도 선언 및 정의 가능
// 추상 클래스는 인스턴스화 할 수 없음
// 상속 가능
public abstract class Vehicle {
	
	private String name;
	
	public Vehicle(String name) {
		this.name = name;
	}

	// 추상 메소드
	// 구현이 없는 선언만 가능 (); 으로 끝나야 함
	// 상속 받은 클래스에서 구현되어야 함
	// private를 사용하지 못함
	// 오버라이딩 필수!!!
	public abstract void start();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
