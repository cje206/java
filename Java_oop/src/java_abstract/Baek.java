package java_abstract;

public class Baek extends Student {
	public Baek(String name, String school, int age, int studentId) {
		super(name, school, age, studentId);
	}
	
	@Override
	public String todo() {
		return "백종원 피자";
	}
}
