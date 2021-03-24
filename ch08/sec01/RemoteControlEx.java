package ch08.sec01;

public class RemoteControlEx {

	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc = null;
		
		rc = new Television(); // Television 객체를 인스턴스 타입에 대입
		rc.turnOn();		// 추상 메소드 사용
		rc.setVolume(10);	// 추상 메소드 사용
		rc.setMute(true);	// 디폴트 메소드 사용
		rc.setMute(false);	// 디폴트 메소드 사용
		rc.turnOff();		// 추상 메소드 사용
		
		rc = new Audio(); 	// Television 객체를 인스턴스 타입에 대입
		rc.turnOn();		// 추상 메소드 사용
		rc.setVolume(12);	// 추상 메소드 사용
		rc.setMute(true);	// 디폴트 메소드 재정의 사용
		rc.turnOff();		// 추상 메소드 사용

		// static 메소드 사용
		RemoteControl.changeBattery();
		
	}

}
