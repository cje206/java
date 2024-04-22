package java_abstract;

public class Bus extends Vehicle {
	public Bus(String name) {
		super(name);
	}
	
	public void start() {
		System.out.println(getName() + "버스가 출발합니다.");
	}
}
