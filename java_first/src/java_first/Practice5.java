package java_first;

import java.util.Scanner;

public class Practice5 {

	public static void operation(double a, double b) {
    	System.out.println("덧셈결과 : " + (a + b));
    	System.out.println("뺄셈결과 : " + (a - b));
    	System.out.println("곱셈결과 : " + (a * b));
    	System.out.println("나눗셈결과 : " + (a / b));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 두 개를 입력하세요");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		operation(a, b);
		scan.close();
	}

}
