package ch07.sec01;

// Child Ŭ���� : Parent Ŭ�����κ��� ��� �޴´�.
// Ű���� extends ���

public class Child extends Parent {
	// Child Ŭ������ �ʵ�
	private int c;
	
	public void setChild() {
		c = 20;
	}
	
	public void showChild() {
		// Child Ŭ������ Parent Ŭ�����κ��� ����� �޾ұ� ������
		// Parent Ŭ������ �޼ҵ� ��� ����
		showParent();
		System.out.println("�ڽ� Ŭ������ c : " + c);
	}
}
