package ch07.sec11;

// 추상 클래스
public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 추상 메소드 : 선언은 되어 있으나
	// 바디가 정의되어 있지 않은 메소드
	// 상속받은 클래스에서 바디 구현(재정의)
	public abstract void sound(); // 추상 메소드

}
