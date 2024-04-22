package java_first;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		} else if( age > 16 && age <= 19) {
			System.out.println("고등학생");
		} else if( age > 13 && age <= 16) {
			System.out.println("중학생");
		} else if ( age > 7 && age <= 13) {
			System.out.println("초등학생");
		} else {
			System.out.println("유아");
		}
		
		
		scan.close();
	}
}
