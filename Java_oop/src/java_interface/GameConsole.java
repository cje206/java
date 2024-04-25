package java_interface;

public interface GameConsole {
	
	int LEVEL = 1; //public static final int LEVEL = 1;
	void up();
	void down();
	void right();
	void left();
	
//	디폴트 메소드
//	필요에 따라서 오버라이드 할 수 있다. 오버라이드 하지 않는 경우 인터페이스에서 구현 된 정의를 사용
	default void spacebar() {
		System.out.println("점프하기");
	}
	
//	static 메소드
	static void staicPrint() {
		System.out.println("게임 정보입니다.");
	}

}

/*
 * 추상 클래스와 인터페이스의 차이점
 * 
 * 1. 상속
 * 추상클래스: 한 클래스는 하나의 추상클래스만 상속
 * 인터페이스: 한 클래스는 여러 인터페이스를 구현가능(다중 상속)
 * 
 * 2. 멤버변수
 * 추상클래스: 멤버변수를 가질 수 있다.
 * 인터페이스: 상수만 포함 가능.
 * 
 * 3. 사용
 * 추상클래스: 상속 관계에서 공통의 기능이나 상태를 유지할 때 사용
 * 인터페이스: 여러 클래스에서 공통으로 필요한 기능을 정의할 때 사용
 * 
 * 4. 생성자
 * 추상클래스: 셍성자와 초기화 가능
 * 인터페이스: 셍성자와 초기화 불가능
 * 
 * 5. 구성 요소
 * 추상클래스: 추상메서드, 일반메서드, 생성자, 멤버변수
 * 인터페이스: 추상메서드, 상수, java8 이상부터 디폴트메소드, static 메소드
 * 
 * 공통점
 * 하위클래스에서 특정한 행동을 강제하기 위해서 사용
 * 
 * */