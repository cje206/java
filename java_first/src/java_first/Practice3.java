package java_first;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요:  ");
		String name = scan.nextLine();
		
		if(name.equals("홍길동")) {
			System.out.println("남자");
		} else if( name.equals("성춘향")) {
			System.out.println("여자");
		} else {
			System.out.println("모르겠습니다");
		}
		
		scan.close();
	}

}
