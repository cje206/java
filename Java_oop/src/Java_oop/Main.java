package Java_oop;

public class Main {

	public static void main(String[] args) {
//		Rectangle
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
//		int width = scan.nextInt();
//		int height = scan.nextInt();
//		Rectangle rec = new Rectangle(5, 8);
//		
//		System.out.println(rec.area());
		
//		scan.close();
		Car hyundai = new Car(30);
		Car kia = new Car();
		hyundai.start();
		kia.start();
		System.out.println(hyundai.getSpeed());
		System.out.println(kia.getSpeed());
		
		hyundai.setSpeed(100);
		kia.setSpeed(-88);
		System.out.println(hyundai.getSpeed());
		System.out.println(kia.getSpeed());
		
		
//		Calculator calc = new Calculator();
//		System.out.println(calc.add(20, 20));
//		System.out.println(calc.subtrack(100, 55));
//		System.out.println(calc.multiply(4, 5));
//		System.out.println(calc.divide(30, 20));

	}

}
