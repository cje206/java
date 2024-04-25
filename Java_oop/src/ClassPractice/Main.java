package ClassPractice;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle airplane = new Airplane();
		Vehicle[] vehicles = {car, airplane};
		
		for( Vehicle vehicle: vehicles) {
			vehicle.move();
			
//			instanceof : 객체가 지정된 유형의 인스턴스인지 여부를 확인하는데 사용하는 비교 연산자
			if(vehicle instanceof Flyable) {
				((Flyable) vehicle).fly();
			}
		}

	}

}
