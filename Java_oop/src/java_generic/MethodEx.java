package java_generic;

import java.util.ArrayList;

// extends: ~을 상속하는
// super: ~이 상속하는

public class MethodEx {
	
//	타입 파라미터를 사용하는 메소드: 데이터 타입을 매개변수처럼 다루게 해준다.
	public <T> void print(T value) {
		System.out.println(value);
	}
	
//	리턴이 있는 메소드
	public <T> T returnTypeMethod(T[] arr) {
		return arr[2];
	}
	
//	extends 키워드
	public <T extends Number> double sum(T[] arr) {
		double sum = 0.0;
		for(T num: arr) {
			sum += num.doubleValue();
		}
		return sum;
	}
//	와일드 카드가 읽기 전용 주로 사용(? extends T)
//	public void wildList(ArrayList<? extends Number> list) {
//		list.add(1); // 불가능
//	}
	
//	super 키워드: 쓰기 전용 주로 사용
	public <T> void addList(ArrayList<? super T> list, T value) {
		list.add(value);
	}

	public static void main(String[] args) {
		MethodEx example = new MethodEx();
		
//		타입 파라미터 사용 메소드
		example.print("Hello World");
		example.print(123123123);
		example.print(false);
		
//		리턴 타입이 있는 메소드
		Integer[] ints = {1, 2, 3, 4, 5};
		Double[] doubs = {1.1, 2.2, 3.3, 4.4, 5.5};
		System.out.println(example.returnTypeMethod(ints));
		System.out.println(example.returnTypeMethod(doubs));
		
//		extends 키워드
		System.out.println(example.sum(doubs));
		
//		super 키워드 - 000의 서브 클래스를 넣으면
		ArrayList<Integer> numList = new ArrayList<>();
		example.addList(numList, 10);
//		example.addList(numList, 3.14);
		System.out.println(numList);
		
		/* 
		 * 와일드카드 주의사항
		 * 1. 복잡성: 와일드카드를 과도하게 사용하면 복잡성이 증가하여, 협업 적합하지 않음
		 * 2. 제한된 작업: '? extends T' 같은 경우, 새로운 요소 추가가 불가능함
		 */
	}
	

}
