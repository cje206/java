package java_inherit;

public class Student extends Person {
	private String school;
	
//	자식 클래스의 생성자
//	1. 자식 클래스의 생성자를 만든다고 해서 부모클래스에서 생성자를 꼭 만들어야하는 것은 아님.
//	모든 클래스는 기본적으로 매개변수가 없는 기본 생성자를 가짐. 
//	부모 클래스에서 생성자를 정의하지 않았다면 기본 생성자가 생성되고, 자식 클래스에서 이 기본 생성자를 자동으로 호출
//	2. 부모 클래스에서 매개변수가 있는 생성자가 존재할 경우
//	부모 클래스에서 매개변수가 있는 생성자가 존재할 경우에는 자식 클래스에 명시적으로 부모클래스의 생성자를 호출해야함.
//	Super() 메소드를 이용해서 생성자를 호출
	public Student(String school, int age, String name) {
		super(name, age);
//		setAge(age);
//		setName(name);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		
		return "Student [학교명은 " + school + ", " + super.toString() + "]";
	}
	
	

}
