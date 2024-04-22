package java_first;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		int i = 1;
		while( i <= num) {
			System.out.print(i + " ");
			i++;
		}
		
		scan.close();

	}
}
