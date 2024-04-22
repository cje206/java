package java_abstract;

public abstract class Student {
	private String name;
	private String school;
	private int age;
	private int studentId;
	
	public Student(String name, String school, int age, int studentId) {
		this.name = name;
		this.school = school;
		this.age = age;
		this.studentId = studentId;
	}
	
	public void print() {
		System.out.printf("=== %s 학생의 정보", name).println();
		System.out.println("학교 : " + school);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + studentId);
		System.out.println("점심은 : " + todo());
	}
	
	public abstract String todo();
}
