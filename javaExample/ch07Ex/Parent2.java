package javaExample.ch07Ex;

public class Parent2 {
	// 7��_6��
	public String nation;

	public Parent2() {
		this("���ѹα�");
		System.out.println("Parent2() call");
		// �ι�°�� ���
	}

	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent2(String nation) call");
		// ù��°�� ���
		// ���� this("���ѹα�")���� �̵�
	}
}
