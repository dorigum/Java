package ch07.sec01;

public class CellPhone {
	// 필드
	String model;
	String color;
	
	// 메소드
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기 : " + message);
	}
	void receiveVoice(String message){
		System.out.println("상대방 : " + message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
