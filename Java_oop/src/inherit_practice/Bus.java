package inherit_practice;

public class Bus extends Vehicle{
	private int passengerCapacity;

	public Bus(String brand, String model, int year, int passengerCapacity) {
		super(brand, model, year);
		this.passengerCapacity = passengerCapacity;
	}

	public void info() {
		System.out.println("=== Bus 정보 ===");
		System.out.println("Bus {"+ super.toString() + ", passengerCapacity=" + passengerCapacity + "}");
	}
	
	public void action() {
		System.out.println("승객을 운송합니다.");
	}
	
}
