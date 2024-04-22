package java_first;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
//		add: 요소 추가
		list.add("Google");
		list.add("Samsung");
		list.add(1, "Amazon");
//		toString 이용하지 않고 바로 출력 가능
		System.out.println(list);
		
//		addAll: 여러 요소 일괄적으로 추가
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Microsoft");
		list.addAll(list2);
		System.out.println(list);
		
//		size: 크기 확인
		System.out.println(list.size());
		
//		contains(params): ArrayList가 params를 포함하고 있는지 여부
		System.out.println(list.contains("Hyundai"));
		
//		get: 특정 요소에 접근
		System.out.println(list.get(2));
		
//		set(index, element): 인덱스에 위치한 값을 교체
		list.set(2, "Hyundai");
		System.out.println(list);
		
//		indexOf: 요소의 인덱스값 찾기(있으면 인덱스 값, 없으면 -1)
		System.out.println(list.indexOf("Samsung"));
		
//		remove: 요소 삭제
		list.remove(0);
		System.out.println(list);
		
//		isEmpty: ArrayList가 비어있는지 확인
		System.out.println(list.isEmpty());
		
//		clear: 모든 요소 삭제
		list.clear();
		System.out.println(list);
		
		
		

	}

}
