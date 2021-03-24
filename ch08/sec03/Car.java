package ch08.sec03;

public class Car {
	// 인터페이스 변수에 객체 구현 대입
	// 인터페이스 타입으로 자동 타입 변환 발생
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backtRightTire = new HankookTire();
	
	public void run() {
		// 인터페이스에 선언된 roll() 메소드 호출
		// HankookTire에 재정의된 roll() 메소드 호출
		// 구현 객체에서 실행
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backtRightTire.roll();
		
	}
}
