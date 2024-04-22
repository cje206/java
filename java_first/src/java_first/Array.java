package java_first;

import java.util.Arrays;

public class Array {
//	가변적 매개변수
//	가변 매개변수는 항상 가장 뒤에 사용한다.
//	int... nums, String str (x)
//	String str, int... nums (o)
	public static int addNumbers(String str, int... nums) {
		System.out.println("String "+ str);
		int total = 0;
		for(int num: nums) {
			total += num;
		}
		return total;
	}

	public static void main(String[] args) {
//		배열의 선언
		int[] arr1 = new int[10]; // 정수 10개를 저장하는 배열, 0으로 초기화
		int[] arr2 = {1, 2, 3, 4, 5}; // 초기값을 가지는 배열
		int[] arr3;
		arr3 = new int[5]; // 나중에 배열을 초기화
		
//		배열 안에 값 넣기
		arr1[3] = 300;
		System.out.println(Arrays.toString(arr1));
		
//		배열 출력
		for( int arr: arr2 ) {
			System.out.print(arr + " ");
		}
		
//		2차원 배열
//		선언
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
//		출력
		for( int[] row: matrix ) {
			for( int num: row ) {
				System.out.print(num + " ");
			}
		}
		matrix[0][1] = 100;
		for( int i = 0; i < matrix.length; i++ ) {
			for( int j = 0; j < matrix[i].length; j++ ) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		
		int sum = addNumbers("hi", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("가변매개변수" + sum);

	}

}
