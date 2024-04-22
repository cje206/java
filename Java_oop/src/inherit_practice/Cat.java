package inherit_practice;

public class Cat extends Animal{
	public Cat(String name, int age) {
		super("고양이", name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println(getName() + "(이)가 야옹 소리를 낸다.");
	}
}
