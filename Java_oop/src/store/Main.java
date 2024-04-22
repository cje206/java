package store;

import Java_oop.Car;

public class Main {

	public static void main(String[] args) {
		Bookstore bookstore = new Bookstore("교보문고", 1000);
		bookstore.print();

		Car kia = new Car(20);
		System.out.println(kia.getSpeed());
		
	}

}
