package java_first;

public class BasicType {

	public static void main(String[] args) {
		int number = 10; //정수형 변수
		double pi = 3.14159; //실수형 변수
		boolean isActive = true; //논리형 변수
		char initial = 'S'; //문자형 변수
		
		
		System.out.println("Number " + number);
		System.out.println("PI " + pi);
		System.out.println("Is Active ? " + isActive);
		System.out.println("Initial " + initial);
		
		//형식지정자를 이용한 출력
		System.out.printf("%d * %d = %d", 10, 2, 10*2);
		//%d:정수
		//%f:실수 ( %.숫자f : 숫자까지 소수점 출력 )
		//ex) %.2f : 소수점 둘째자리까지 
		//%s:문자열
		//%c:문자
		//%b:boolean
	}

}
