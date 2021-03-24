package ch07.sec07;

class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}


// A -> B -> D
// A -> C -> E
public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 부모 클래스 타입 변수 = 자식 객체
		A a1 = b; // A타입 변수에 b 객체 대입(자동 타입 변환)
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 컴파일 오류 : 상속 관계에 있지 않기 때문
		/*B b3 = e; // 타입 불일치 오류 발생
		C c2 = d;*/

	}

}
