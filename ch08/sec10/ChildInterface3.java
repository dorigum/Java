package ch08.sec10;

//부모 인터페이스의 디폴트 메소드를 자식 인터페이스에서 활용하는 방법
//(3) 디폴트 메소드를 추상 메소드로 재선언해서 사용

public interface ChildInterface3 extends ParentInterface {
	@Override
	public void method2();	// default 제거하고 추상 메소드로 재선언
	public void method3();	// 추상 메소드
	
}
