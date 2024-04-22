package java_first;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요");
		int[] arr = new int[5];
		int sum = 0;
		for (int num: arr) {
			num = scan.nextInt();
			sum += num;
		}
		
		System.out.printf("평균은 %.1f", (double)sum/5);
		
		scan.close();
	}

}
