package ch07.sec04.pack1;

// 필드와 메소드의 접근 제한
// 클래스 내부에서는 접근 제한과 상관 없이 모든 필드와 메소드 사용 가능

public class AAA {
	// 필드
	public int field1;		// public 접근 제한
	int field2;				// default 접근 제한
	private int field3;		// private
	protected int field4;		// protected
	
	// 클래스 내부에서 접근 확인
	public AAA() {
		field1 = 1;		// (O) 클래스 내부에서 접근 제한 X
		field2 = 2;		// (O) 클래스 내부에서 접근 제한 X
		field3 = 3;		// (O) 클래스 내부에서 접근 제한 X
		
		method1();		// (O) 클래스 내부에서 접근 제한 X
		method2();		// (O) 클래스 내부에서 접근 제한 X
		method3();		// (O) 클래스 내부에서 접근 제한 X
		
	}
	
	// 메소드
	public void method1() {}	// public
	void method2() {}			// default
	private void method3() {}	// private
	protected void method4() {}	// protected
}
