package java_generic;

import java.util.ArrayList;

//일반 클래스
public class MyClass {
	ArrayList<String> list = new ArrayList<>();
	
	public void addElement(String elem) {
		list.add(elem);
	}
	
	public void removeElement(String elem) {
		list.remove(elem);
	}
	
}
