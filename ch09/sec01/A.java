package ch09.sec01;

// 중첩 클래스(선언 위치에 따라 분류)
// 1. 멤버 클래스 : 클래스 멤버로서 선언되는 클래스(필드/메소드 선언 위치에 정의)
// 	(1) 인스턴스 멤버 클래스 : 바깥 클래스(A) 객체를 생성해야만 사용 가능
//	(2) static 멤버 클래스 : 바깥 클래스(A)로 바로 접근 가능(객체 생성 필요 없음)
// 2. 로컬 클래스 : 메소드 내부에 선언되는 클래스
//	-메소드가 실행 될 때만 사용 가능

public class A {
	A (){ System.out.println("A 객체 생성");}
	
	// 인스턴스 멤버 클래스
	public class B{
		B(){ System.out.println("B 객체 생성");}
		// 필드 선언
		int field1;	// 인스턴스 필드
		//static int field2;	// static 필드 선언 불가
		
		// 메소드 정의
		void method1() { System.out.println("B 클래스의 method1() 실행");}	// 인스턴스 메소드
		//static void method2() {}	// static 메소드 선언 불가
	}
	
	/*static 멤버 클래스*/
	static class C{
		// 생성자
		C(){ System.out.println("C 객체 생성");}
		// 인스턴스 필드와 메소드, static 필드와 메소드 선언 가능
		// 필드
		int field1;
		static int field2;
		void method1() {System.out.println("C 클래스의 method1() 실행");}
		static void method2() {System.out.println("C 클래스의 method2() 실행");}		
	}
	
	// A 클래스의 멤버 메소드
	void method() {
		// 로컬 클래스 : 메소드 내에서 선언
		// 메소드 내에서 객체를 생성하고 사용해야 함
		class D{
			D(){ System.out.println("D 객체 생성");}
			// 필드
			int field1;
			//static int field2;	// static 필드 선언 불가
			// 메소드
			void method1() { System.out.println("D 클래스의 method1() 실행");}
			//static void method2() {}	// static 메소드 정의 불가
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		
	}
	
}









