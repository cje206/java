package Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
//		LinkedList
		List<String> linked = new LinkedList<>();
		linked.add("A");
		linked.add("B");
		linked.add("C");
		linked.add("C");
		linked.remove(1);
		System.out.println(linked);
		
//		Set
//		HashSet: 중복 제거, 요소의 순서를 보장하지 않는다.
		Set<String> hashSet = new HashSet<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("A");
		System.out.println(hashSet);
//		LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		linkedHashSet.add("C");
		System.out.println(linkedHashSet);
//		TreeSet: 중복 제거, 오름차순 출력. 시간 복잡도가 증가한다.
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("B");
		treeSet.add("D");
		treeSet.add("C");
		treeSet.add("A");
		System.out.println(treeSet);
		
//		Map
//		HashMap
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("one", 1);
		hashMap.put("two", 2);
		hashMap.put("three", 3);
		System.out.println(hashMap);
//		LinkedHashMap
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("three", 3);
		linkedHashMap.put("one", 1);
		linkedHashMap.put("two", 2);
		System.out.println(linkedHashMap);
//		TreeMap
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("C", 3);
		treeMap.put("A", 1);
		treeMap.put("B", 2);
		System.out.println(treeMap);
		
		

	}

}
