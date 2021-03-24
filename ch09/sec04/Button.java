package ch09.sec04;

// 중첩 인터페이스 : 클래스의 멤버로 선언된 인터페이스

public class Button {
	// 필드
	// 인터페이스 타입으로 필드 선언
	OnClickListener listener;
	
	// 메소드
	// Setter 메소드로 구현 객체를 매개변수로 전달 받아서 필드에 대입
	void setOnClickListener(OnClickListener listener) {	// 매개변수 다형성(매개변수가 인터페이스 이면 다양한 구현 객체를 받을 수 있음)
		this.listener = listener;	
	}
	
	// 메소드 : 버튼 클릭했을 때(이벤트 발생 시) 호출되는 메소드
	void touch() {
		// 인터페이스를 통해 구현 객체의 메소드 호출
		listener.onClick();
	}
	
	// 중첩 인터페이스 : Button 클래스 내부에 선언
	// 바깥 클래스와 밀접한 관계가 있고,
	// 클래스 외부에서는 사용하지 않고, Button에서만 사용하므로
	// 중첩 인터페이스로 생성
	interface OnClickListener{
		void onClick();	// 추상 메소드
	}

}







