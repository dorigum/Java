package ch09.sec01;

public class NestedEx {

	public static void main(String[] args) {
		// 인스턴스 멤버 클래스를 사용하기 위해서는
		// A 클래스객체를 생성하고 B 객체를 생성해야 함
		A a = new A();
		
		// 인스턴스 멤버 클래스 B 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		
		
		System.out.println("--------------------------");
		
		// static 멤버 클래스의 객체 생성
		// 인스턴스 멤버 접근 : 객체 필요
		A.C c = new A.C();
		c.field1 =3;
		c.method1();
		
		// static 멤버 접근 : 클래스로 접근
		A.C.field2 = 3;
		A.C.method2();

		
		
		System.out.println("--------------------------");

		// 로컬 클래스 객체 생성하도록 메소드 호출
		a.method();
	}

}
