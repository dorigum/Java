package ch08.sec10;

// 부모 인터페이스의 디폴트 메소드를 자식 인터페이스에서 활용하는 방법
// (1) 디폴트 메소드를 단순히 상속만 받아서 사용
public interface ChildInterface1 extends ParentInterface {
	public void method3();	// 추상 메소드
	
}

// ChildInterface1를 구현하는 클래스는
// method1()과 method3()을 반드시 재정의 해야 함(실제 메소드를 가지고 있어야 함)