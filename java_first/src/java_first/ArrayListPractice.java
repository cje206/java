package java_first;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("문자를 입력해주세요. : ");
		for (int i = 0; i < list.size()+1 ; i++) {
			String str = scan.nextLine();
			switch (str) {
			case "exit":
				break;
			default:
				System.out.println("문자를 입력해주세요. : ");
				list.add(str);
			}
		}
		scan.close();
		for(String arr: list) {
			System.out.println(arr);
		}

	}

}
