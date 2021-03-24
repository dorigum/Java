package ch08.sec09;

public interface MyInterface {
	public void method1();	// 추상 메소드
	// 새로운 메소드 추가 필요
	// 추상 메소드로 추가하면
	// 기존에 이 인터페이스를 구현한 클래스에서
	// 새로 추가된 모든 추상 메소드를 재정의 해야한다.(안하면 오류)
	//public void method2();	// 추상 메소드로 추가하지 않고
	
	// 디폴트 메소드로 추가
	// default 메소드 : 바디가 있다. (실행 블록을 가지고 있는 메소드)
	public default void method2() {
		System.out.println("MyInterface-method2() 실행");
	}
}
