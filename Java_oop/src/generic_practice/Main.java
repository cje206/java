package generic_practice;

public class Main {

	public static void main(String[] args) {
		Pair<String, Integer> pair1 = new Pair<>("One", 1);
		Pair<Integer, String> pair2 = new Pair<>(2, "Two");
		
		System.out.printf("Key: %s, Value: %d", pair1.getKey(), pair1.getValue()).println();
		System.out.printf("Key: %d, Value: %s", pair2.getKey(), pair2.getValue()).println();
		
		
		Calculator<Integer> integerSum = new Calculator<>(7, 8);
		System.out.println("Integer Sum: " + integerSum.add());
		
		Calculator<Double> doubleSum = new Calculator<>(2.5, 3.14);
		System.out.println("Double Sum: " + doubleSum.add());

	}

}
