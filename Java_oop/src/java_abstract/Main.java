package java_abstract;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("기아");
		car.start();
		
		Bus bus = new Bus("420번");
		bus.start();
		
		Student kim = new Kim("김철수", "ABC 고등학교", 17, 20220001);
		Student baek = new Baek("백영희", "XYZ 고등학교", 18, 20220002);
		
		kim.print();
		baek.print();

	}

}
