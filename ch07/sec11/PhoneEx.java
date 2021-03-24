package ch07.sec11;

public class PhoneEx {

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성할 수 없다.
		//Phone phone = new Phone();

		// 그러나 자식 클래스의 객체를 생성해서
		// Phone 클래스의 메소드를 사용할 수 있다.
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		
	}

}
