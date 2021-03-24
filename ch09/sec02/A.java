package ch09.sec02;

public class A {
	// 인스턴스 필드 초기화
	B field1 = new B();	// 필드의 초기값으로 객체 생성 및 초기 값으로 사용 가능
	C field2 = new C();	// static 클래스 객체 생성 가능 및 초기 값으로 사용 가능
	
	// 인스턴스 메소드
	void method1() {
		B var1 = new B();	// 인스턴스 메소드 내에서 객체 생성 및 초기값으로 사용 가능
		C var2 = new C();	// 인스턴스 메소드 내에서 객체 생성 가능 및 초기 값으로 사용 가능
	}
	
	// static 필드 초기화
	//static B field3 = new B();	// 인스턴스 멤버 클래스 B는 static 필드 초기화로 사용 불가
	static C field4 = new C();		// 가능
	
	// static 메소드
	static void method2() {
		//B var1 = new B();	// static 멤버 클래스에서 인스턴스 멤버 클래스 B로 초기화 불가
		//C var2 = new C();
	}
	
	class B {  }
	
	static class C{}
}
