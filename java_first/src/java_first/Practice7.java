package java_first;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[5];
		
		System.out.print("숫자 5개를 입력하세요. : ");
		for( int i =0; i < intArray.length; i++) {
			intArray[i] = scan.nextInt(); 
		}
		
		int sum = 0;
		for ( int arr : intArray ) {
			sum += arr;
		}
		
		double avg = (double)sum/intArray.length;
		System.out.printf("평균은 %.1f", avg);
		
		scan.close();

	}
}
