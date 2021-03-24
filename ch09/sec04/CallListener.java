package ch09.sec04;

public class CallListener implements Button.OnClickListener {
	// OnClickListener 중첩 인터페이스의 추상 메소드 재정의
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}

}
