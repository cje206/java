package store;

public class Bookstore {
	
//	변수(필드, 데이터)
	private String name;
	private int books;
	
//	생성자
	public Bookstore(String name, int books) {
		this.books = books;
		this.name = name;
	}
	
//	메소드
	public void print() {
		System.out.println("서점명은 " + name + ", 책 수량은 " + books);
	}
	
}