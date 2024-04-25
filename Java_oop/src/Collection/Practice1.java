package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");
		
		Set<Integer> nums = new HashSet<>();
		
		while (true) {
			System.out.print("정수입력: ");
			int num = scan.nextInt();
			if (num == -1) {
				break;
			}
			nums.add(num);
		}
		
		System.out.println("중복 제거된 정수 목록: " + nums);
		scan.close();

	}

}
