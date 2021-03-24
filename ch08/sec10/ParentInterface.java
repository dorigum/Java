package ch08.sec10;

// 디폴트 메소드가 있는 인터페이스 상속
// 부모 인터페이스의 디폴트 메소드를 자식 인터페이스에서 활용하는 방법(3가지)
// (1) 디폴트 메소드를 단순히 상속만 받아서 사용					-- ChildInterface1
// (2) 디폴트 메소드를 재정의(Override)해서 실행 내용을 변경 후 사용	-- ChildInterface2
// (3) 디폴트 메소드를 추상 메소드로 재선언해서 사용					-- ChildInterface3

public interface ParentInterface {
	public void method1(); // 추상 메소드
	
	// 디폴트 메소드
	public default void method2() {
		System.out.println("ParentInterface의 디폴트 메소드 method2() 실행");
	}
}
