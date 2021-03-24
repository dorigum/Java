package ch08.sec06;

public class VehicleEx {

	public static void main(String[] args) {
		// 인터페이스 변수에 Bus 객체 대입
		// Vehicle 타입으로 자동 타입 변환
		Vehicle vehicle = new Bus();
		
		// Vehicle 타입이므로 Vehicle 멤버만 사용 가능
		vehicle.run();
		// Vehicle 타입으로 자동 변환되었기 때문에
		// Bus 멤버 사용 불가
		//vehicle.checkFare(); // (X)
		
		// Bus 멤버를 사용하려면 다시 타입을 변환해야한다. : 강제 타입 변환
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
	}

}
