package ch07.sec07;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		// 부모 클래스 타입 변수에 자식 클래스 객체 대입
		Parent parent = child;	// 자동 타입 변환 발생
		// parent 변수는 child 객체를 참조하지만
		// Parent 멤버만 사용 가능
		
		
		// Parent 메소드 사용 가능
		parent.method1();
		
		// child 객체를 참조하지만 Child 멤버는 사용할 수 없다.
		//parent.method3();	// 호출 불가능

		parent.method2(); // 재정의된 Child 메소드 호출
		// Parent 타입으로 Parent 클래스의 method2()를 실행하려고 보니까
		// Child 클래스에 재정의 되어 있는 것을 확인
		// 그러면 부모 멤버를 호출하지 않고, 자식에 재정의된 멤버 메소드를 호출
	}

}
