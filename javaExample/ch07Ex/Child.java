package javaExample.ch07Ex;

public class Child extends Parent {
	// 7��_5��
	private int studentNo;

	public Child(String name, int studentNo) {
		super(name);	// �ڽ� Ŭ�������� �θ� �����ڸ� ȣ������ �ʾұ� ����
		this.name = name;
		this.studentNo = studentNo;
	}

}
