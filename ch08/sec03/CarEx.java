package ch08.sec03;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		// �ʵ��� ������
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		
	}

}
