package composition;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 22);
		Student s2 = new Student("성춘향", 21);
		Student s3 = new Student("이몽룡", 24);
		
		Student[] students = {s1, s2, s3};
		
		Classroom kdt = new Classroom("kdt11", students);
		
		kdt.print();

	}

}
