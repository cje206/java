package java_first;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		
		while(true) {
			System.out.println("문자를 입력해주세요 :");
			String input = scan.nextLine();
			if( input.equals("exit") ) {
				break;
			}
			str.add(input);
		}
		
		for (String a: str) {
			System.out.println(a);
		}
		
		scan.close();

	}

}
