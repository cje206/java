package inherit_practice;

public class Motorcycle extends Vehicle {
	private String licenseType;

	public Motorcycle(String brand, String model, int year, String licenseType) {
		super(brand, model, year);
		this.licenseType = licenseType;
	}

	public void info() {
		System.out.println("=== Motorcycle 정보 ===");
		System.out.println("Motorcycle {"+ super.toString() + ", licenseType=" + licenseType + "}");
	}
	
	public void action() {
		System.out.println("울림통을 합니다.");
	}
}
