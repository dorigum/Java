package ch09.sec06;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 1. 익명 객체가 대입된 필드 사용
		anony.field.turnOn();
		
		// 2. 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 3. 익명 객체 매개값 사용
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
				
			}
			
		});

	}

}
