package java_first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
//		숫자를 0으로 나눈 경우
//		int num1 = 4;
//		int num2 = 0;
//		System.out.printf("num1 / num2 = %d", num1/num2);
		
		try {
			int num1 = 4;
			int num2 = 0;
			System.out.printf("num1 / num2 = %d", num1/num2);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누어 예외 발생");
			System.out.println(e);
		}
		
//		인덱스의 범위를 벗어났을 때
		try {
			int[] intArray = { 1, 2, 3, 4 };
			for ( int i = 0; i < 5; i++ ) {
				System.out.println(intArray[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위가 벗어났습니다.");
		}
		
//		입력 오류 발생 시
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		try {
			int num = scan.nextInt();
			System.out.println("입력된 정수는 " + num);
		} catch(InputMismatchException e) {
			System.out.println("입력 오류, 정수를 입력하세요");
		}
		
		scan.close();
		
//		null에 접근하는 경우
		String text = null;
		try {
			System.out.println(text.length());
		} catch (NullPointerException e) {
			System.out.println("Null값에 접근할 수 없습니다.");
		}

	}

}
