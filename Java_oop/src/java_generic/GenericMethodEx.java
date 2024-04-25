package java_generic;

import java.util.ArrayList;

public class GenericMethodEx {
	
//	T extends Number
	public static <T extends Number> double sum(ArrayList<T> list) {
		double sum = 0.0;
		for(T num: list) {
			sum += num.doubleValue();
		}
		return sum;
	}
	
//	? extends Number: Number 클래스 또는 하위 클래스만 가능. 읽기 전용 작업에 사용
	public static double sumWild(ArrayList<? extends Number> list) {
		double sum = 0.0;
		for(Number num: list) {
			sum += num.doubleValue();
		}
		return sum;
	}
	
//	? extends T: T 타입 또는 하위 타입을 허용. 읽기 전용 작업에 사용
//	public static void print (ArrayList<?> list)
	public static <T> void print(ArrayList<? extends T> list) {
		if(!list.isEmpty()) {
			T value = list.get(0);
			System.out.println(value);
		}
	}
//	T super Number 라는 문법은 올바르지 않음. 자바에서는 super 키워드는 타입 파라미터에 직접 사용할 수 없음.
//	? super Number: Number 클래스 또는 그 상위 클래스를 허용. 주로 쓰기 작업에 사용.
	public static void addNumber(ArrayList<? super Number> list) {
		list.add(Integer.valueOf(1));
		list.add(Double.valueOf(1.1));
	}
//	? super T: T타입 또는 그 상위 타입을 허용. 쓰기 작업에 사용.
	public static <T> void addItem(ArrayList<? super T> list, T item) {
		list.add(item);
	}

	public static void main(String[] args) {
		
//		T extends Number 사용 예제
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.1);
		doubleList.add(20.2);
		System.out.println("덧셈 결과 : " + sum(doubleList));
		
//		? extends Number 사용 예제
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		System.out.println("덧셈 결과 : " + sumWild(integerList));
		
//		? extends T 사용 예제
		ArrayList<Integer> integerList2 = new ArrayList<>();
		integerList2.add(1);
		integerList2.add(2);
		print(integerList2);
		
//		? super Number 사용 예제
		ArrayList<Number> numberList = new ArrayList<>();
		addNumber(numberList);
		System.out.println("배열은 " + numberList);
		
//		? super T 사용 예제
		ArrayList<Integer> numberList2 = new ArrayList<>();
		addItem(numberList2, 10);
//		addItem(numberList2, 1.1);
		System.out.println("배열은 " + numberList2);
		
		ArrayList<Object> objectList = new ArrayList<>();
		addItem(objectList, "Hello World");
		addItem(objectList, 3.14);
		addItem(objectList, 10000000);
		System.out.println("오브젝트 배열은 " + objectList);
		
	}

}
