package ch07.sec11;

public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println("-----");

		Animal animal = null;
		
		animal = new Dog(); // �ڵ� Ÿ�� ��ȯ
		animal.sound();
		
	}

}
