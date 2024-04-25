package Collection;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Practice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> info = new TreeMap<>();
		System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
		
		while (true) {
			System.out.print("이름 입력: ");
			String name = scan.next();
			if (name.equals("종료")) {
				break;
			}
			if(info.containsKey(name)) {
				info.remove(name);
			}
			
			System.out.print("나이 입력: ");
			int age = scan.nextInt();
			info.put(name, age);
		}
		
		System.out.println();
		System.out.println("== 입력 받은 이름과 나이 목록 ==");
		for (Map.Entry<String, Integer> member: info.entrySet()) {
			System.out.printf("이름: %s, 나이: %d", member.getKey(), member.getValue()).println();
		}
		scan.close();

	}

}
