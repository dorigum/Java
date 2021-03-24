package ch07.sec01;

// Child 클래스 : Parent 클래스로부터 상속 받는다.
// 키워드 extends 사용

public class Child extends Parent {
	// Child 클래스의 필드
	private int c;
	
	public void setChild() {
		c = 20;
	}
	
	public void showChild() {
		// Child 클래스는 Parent 클래스로부터 상속을 받았기 때문에
		// Parent 클래스의 메소드 사용 가능
		showParent();
		System.out.println("자식 클래스의 c : " + c);
	}
}
