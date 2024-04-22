package inherit_practice;

public class Car extends Vehicle{
	private Boolean convertible;

	public Car(String brand, String model, int year, Boolean convertible) {
		super(brand, model, year);
		this.convertible = convertible;
	}

	public void info() {
		System.out.println("=== Car 정보 ===");
		System.out.println("Car {"+ super.toString() + ", convertible=" + convertible + "}");
	}
	
	public void action() {
		System.out.println("주차했습니다.");
	}
}
