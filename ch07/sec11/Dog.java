package ch07.sec11;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	// 추상 메소드 재정의
	// 필수
	// 클래스 생성 시 자동 포함되어 있음
	@Override
	public void sound() {
		System.out.println("멍멍");

	}

}
