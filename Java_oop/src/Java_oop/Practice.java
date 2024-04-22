package Java_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Rectangle> rect = new ArrayList<>();
		
		while (true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			int width = scan.nextInt();
			Rectangle newRect = new Rectangle(width);
			int height = scan.nextInt();
			newRect.setHeight(height);
			if(width == 0 && height == 0) {
				break;
			}
			rect.add(newRect);
		}
		
		for ( int i = 0; i < rect.size(); i++ ) {
			System.out.println("가로 길이는: " + rect.get(i).getWidth());
			System.out.println("세로 길이는: " + rect.get(i).getHeight());
			System.out.println("넓이는: " + rect.get(i).area());
			System.out.println("-------------------------------");
		}
		
		scan.close();

	}

}
