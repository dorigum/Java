package ch07.sec09;

// 강제 타입 변환 (Casting)
// 부모 타입을 자식 타입으로 변환하는 것
// 주의! : 모든 부모 타입을 자식 클래스 타입으로 강제 변환할 수 있는 것은 아니고
// 자식 타입에서 부모 타입으로 변환된 경우만 가능!
// 자동 타입 변환 : 자식 객체 --> 부모 타입
// 강제 타입 변환 : 자동 타입 변환이 일어난 후, 다시 자식 타입으로 돌아가는 것

public class Parent {
	public String f1;
	
	public void method1() {
		System.out.println("Parent-method()1");
	}
	
	public void method2() {
		System.out.println("Parent-method()2");
	}
}
