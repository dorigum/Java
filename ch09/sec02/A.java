package ch09.sec02;

public class A {
	// �ν��Ͻ� �ʵ� �ʱ�ȭ
	B field1 = new B();	// �ʵ��� �ʱⰪ���� ��ü ���� �� �ʱ� ������ ��� ����
	C field2 = new C();	// static Ŭ���� ��ü ���� ���� �� �ʱ� ������ ��� ����
	
	// �ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();	// �ν��Ͻ� �޼ҵ� ������ ��ü ���� �� �ʱⰪ���� ��� ����
		C var2 = new C();	// �ν��Ͻ� �޼ҵ� ������ ��ü ���� ���� �� �ʱ� ������ ��� ����
	}
	
	// static �ʵ� �ʱ�ȭ
	//static B field3 = new B();	// �ν��Ͻ� ��� Ŭ���� B�� static �ʵ� �ʱ�ȭ�� ��� �Ұ�
	static C field4 = new C();		// ����
	
	// static �޼ҵ�
	static void method2() {
		//B var1 = new B();	// static ��� Ŭ�������� �ν��Ͻ� ��� Ŭ���� B�� �ʱ�ȭ �Ұ�
		//C var2 = new C();
	}
	
	class B {  }
	
	static class C{}
}
