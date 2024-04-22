package composition;

public class Student {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("제 이름은 " + name + ", 나이는 " + age + "입니다.");
	}

}
