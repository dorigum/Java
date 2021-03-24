package ch06.sec05;

public class Singleton {
	// 클래스 자신의 타입으로 정적(static) 필드 선언
	// 외부에서 접근하지 못하도록 private로 선언
	private static Singleton singleton = new Singleton();
	
	// 생성자
	// 외부에서 new 연산자를 사용해서 생성자를 호출할 수 없도록 막아준다.
	// private로 설정
	private Singleton(){}
	
	// 외부에서 호출할 수 있는정적 메소드 사용
	// 정적 필드에서 참조하고 있는 자신의 객체를 리턴
	public static Singleton getInstance() {
		return singleton; //클래스 타입
	}

}
