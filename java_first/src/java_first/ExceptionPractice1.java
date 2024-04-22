package java_first;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("배열의 크기를 입력하세요 :");
			int input = scan.nextInt();
			
//			배열 크기를 음수로 입력했을 경우
			if (input < 0) {
				throw new NegativeArraySizeException("배열의 크기는 음수가 될 수 없습니다.");
			}

			if (input == 0) {
				throw new ArithmeticException("배열의 크기는 0이 될 수 없습니다.");
			}
			
			int[] arr = new int[input];
			int sum = 0;
			System.out.println("배열 요소를 입력하세요 :");
			for ( int i = 0; i < input; i++ ) {
				arr[i] = scan.nextInt();
				sum += arr[i];
			}
			System.out.println("요소의 평균 :" + (double)sum/input);
			
			
		} catch (InputMismatchException e) {
			System.out.println("오류 발생 : 배열의 크기는 정수로 입력하세요.");
		} catch (ArithmeticException e) {
			System.out.println("오류 발생 : " + e.getMessage());
		} catch (NegativeArraySizeException e) {
			System.out.println("오류 발생 : " + e.getMessage());			
		} finally {
			scan.close();
		}
		
		

	}
                                                         
}
