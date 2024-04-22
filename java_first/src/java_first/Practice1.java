package java_first;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//이름입력
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		
		//나이입력
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		
		System.out.println("안녕하세요! " + name + "님(" + age + "세)");
		//System.out.println("안녕하세요! %s님(%d세)", name, age);
		
		scan.close();
	}

}
