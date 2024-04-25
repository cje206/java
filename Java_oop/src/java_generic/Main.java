package java_generic;

public class Main {

	public static void main(String[] args) {
		
//		제네릭 클래스
//		MyCustom<Integer> list = new MyCustom<>();
//		list.addElement(1);
//		list.addElement(2);
//		list.addElement(100);
//		System.out.println(list.list);
		MyCustom<Double> list = new MyCustom<>();
		list.addElement(1.4);
		list.addElement(2.353);
		list.addElement(100.11);
		System.out.println(list.list);
		
		
//		일반 클래스
//		MyClass list = new MyClass();
//		list.addElement("Apple");
//		list.addElement("Amazon");
//		list.addElement("Samsung");
//		System.out.println(list.list);

	}

}
