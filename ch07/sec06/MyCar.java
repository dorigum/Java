package ch07.sec06;

public class MyCar {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	// final 메소드 : 재정의(오버라이딩) 불가
	public final void stop() {
		System.out.println("자동 멈춤");
		speed = 0;
	}
}
