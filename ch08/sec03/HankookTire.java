package ch08.sec03;

public class HankookTire implements Tire {

	// 인터페이스의 추상 메소드 roll() 재정의
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}
