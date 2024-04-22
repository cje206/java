package inherit_practice;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super("강아지", name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println(getName() + "(이)가 멍 소리를 낸다.");
	}
}
