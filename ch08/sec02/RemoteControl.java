package ch08.sec02;

public interface RemoteControl {
	// 상수 필드 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드 선언
	// 추상 메소드 : 선언만 있고, 바디가 없는 메소드
	// 바디 : 실행 블록{...}
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 선언 : 실행 블록을 가지고 있는 메소드
	// default 붙여야 함
	default void setMute(boolean mute) {
		if(mute) {	// if(mute==true)
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// static 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
