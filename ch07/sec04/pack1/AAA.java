package ch07.sec04.pack1;

// �ʵ�� �޼ҵ��� ���� ����
// Ŭ���� ���ο����� ���� ���Ѱ� ��� ���� ��� �ʵ�� �޼ҵ� ��� ����

public class AAA {
	// �ʵ�
	public int field1;		// public ���� ����
	int field2;				// default ���� ����
	private int field3;		// private
	protected int field4;		// protected
	
	// Ŭ���� ���ο��� ���� Ȯ��
	public AAA() {
		field1 = 1;		// (O) Ŭ���� ���ο��� ���� ���� X
		field2 = 2;		// (O) Ŭ���� ���ο��� ���� ���� X
		field3 = 3;		// (O) Ŭ���� ���ο��� ���� ���� X
		
		method1();		// (O) Ŭ���� ���ο��� ���� ���� X
		method2();		// (O) Ŭ���� ���ο��� ���� ���� X
		method3();		// (O) Ŭ���� ���ο��� ���� ���� X
		
	}
	
	// �޼ҵ�
	public void method1() {}	// public
	void method2() {}			// default
	private void method3() {}	// private
	protected void method4() {}	// protected
}
