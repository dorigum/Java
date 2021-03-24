package ch07.sec08;

public class Driver {
	// 매개변수 다형성
	// 매개값을 다양화하기 위해서
	// 매개변수에 자식 타입 객체 허용
	// 자동 타입 변환
	// bus 객체가 Vehicle 타입으로
	// taxi 객체가 Vehicle 타입으로
	
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
