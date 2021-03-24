package ch09.sec06;

public class Anonymous {
	// 1. 클래스의 필드 초기값으로 익명 구현 객체를 생성해서 대입
	// 필드
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}
		
	};
	
	// 2. 메소드 내에서 로컬 변수를 선언할 때
	// 초기값으로 익며 구현 객체를 생성해서 대입
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		
		localVar.turnOn();
		
	}
	
	// 3. 메소드의 매개값으로 익명 구현 객체 전달
	// 메소드의 매개값으로 메소드 호출 코드에서 익명 구현 객체를 생성해서 대입
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
