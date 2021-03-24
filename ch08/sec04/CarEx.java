package ch08.sec04;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		// 필드의 다형성
		// 배열의 인덱스 사용
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
		
	}

}
