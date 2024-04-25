package java_generic;

import java.util.ArrayList;

// 제네릭 클래스
public class MyCustom<T extends Number> {
	ArrayList<T> list = new ArrayList<>();
	
	public void addElement(T elem) {
		list.add(elem);
	}
	
	public void removeElement(T elem) {
		list.remove(elem);
	}
}
