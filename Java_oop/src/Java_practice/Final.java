package Java_practice;

import java.util.ArrayList;

public class Final {

	public static void main(String[] args) {
		final int x = 10;
		//x = 20;  //한번 할 당 후 재할당 불가
		
		final ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		//list = new ArrayList<>();
		
		//메소드에 final시 메소드 오버라이딩이 될 수 없습니다.
		//클래스에 final시 더 이상 상속할 수 없습니다.
		
		
	
	}
	

}