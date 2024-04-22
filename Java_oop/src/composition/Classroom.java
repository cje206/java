package composition;

public class Classroom {
	
	private String roomName;
	private Student[] students;
	
	public Classroom(String room, Student[] stud) {
		this.roomName = room;
		this.students = stud;
	}
	
	public void print() {
		System.out.println("우리는 코딩온 " + roomName + "기 입니다.");
		for(Student student: students) {
			student.print();
		}
	}

}
