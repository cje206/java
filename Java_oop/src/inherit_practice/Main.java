package inherit_practice;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("나비", 5);
		cat1.makeSound();
		
		Bus bus1 = new Bus("Hyundai", "City Bus", 2022, 30);
		bus1.info();
		bus1.start();
		bus1.action();
		bus1.stop();
		
		Car car1 = new Car("Toyota", "Camry", 2023, true);
		car1.info();
		car1.start();
		car1.action();
		car1.stop();
		
		Motorcycle Motorcycle1 = new Motorcycle("Harley-Davidson", "Sportster", 2021, "A");
		Motorcycle1.info();
		Motorcycle1.start();
		Motorcycle1.action();
		Motorcycle1.stop();

	}

}
