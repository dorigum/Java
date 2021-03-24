package ch07.sec09;

public class ChildEx {

	public static void main(String[] args) {
		// Parent 타입 변수에 Child 객체 대입
		Parent parent = new Child();	// 부모 타입으로 자동 타입 변환 발생
		// Parent 멤버만 사용 가능
		parent.f1 = "data1";
		parent.method1();
		parent.method2();
		
		// Parent 타입으로 변환된 후에는
		// Child 클래스의 멤버 사용 불가
		//parent.f2 = "data2";
		//parent.method3();

		// 다시 Child 타입으로 변환 : 강제 타입 변환
		Child child = (Child) parent;
		child.method3();	// Child 클래스 멤버 사용 가능
		
	}

}
