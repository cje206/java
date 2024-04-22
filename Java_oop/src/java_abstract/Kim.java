package java_abstract;

public class Kim extends Student {
	public Kim(String name, String school, int age, int studentId) {
		super(name, school, age, studentId);
	}

	@Override
	public String todo() {
		return "김가네 김밥";
	}
}
