package java_inherit;

public class Person {
	private int age;
	private String name;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	Override 어노테이션이며, 상속받았다는 것을 명시적으로 알려주기 위해서 작성
	@Override
	public String toString() {
		return "사람 이름은 " + name + ", 나이는 " + age + "세 입니다.";
	}

}
