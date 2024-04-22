package Java_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Practice2 circle = new Practice2(10);
//		원의 넓이 계산
		double area = circle.calculateArea();
		
//		결과
		System.out.println("원의 반지름을 입력하세요 : " + 10);
		System.out.println("원의 반지름 : " + circle.getRadius());
		System.out.println("원의 넓이 : " + area);
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Practice1> rectangles = new ArrayList<>();
		
		while (true) {
			System.out.println("가로 길이를 입력해주세요");
			int width = scan.nextInt();
			System.out.println("세로 길이를 입력해주세요");
			int height = scan.nextInt();
			
			if(width == 0 && height == 0) {
				break;
			}
			
			Practice1 rect = new Practice1(width);
			rect.setHeight(height);
			
			rectangles.add(rect);
		}
		
		for(Practice1 r: rectangles) {
			System.out.println("가로 길이는: " + r.getWidth());
			System.out.println("세로 길이는: " + r.getHeight());
			System.out.println("넓이는: " + r.area());
			System.out.println("-------------------------------");
		}
		
//		static 출력
		System.out.println("사각형 개수는 : " + Practice1.getCount());
		
		int multiply = MathMultiply.square(6);
		System.out.println(multiply);
		scan.close();

	}

}
