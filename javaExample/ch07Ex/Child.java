package javaExample.ch07Ex;

public class Child extends Parent {
	// 7장_5번
	private int studentNo;

	public Child(String name, int studentNo) {
		super(name);	// 자식 클래스에서 부모 생성자를 호출하지 않았기 때문
		this.name = name;
		this.studentNo = studentNo;
	}

}
