package ch08.sec09;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB���� ������ - method1(1) ����");
	}
	
	// MyInterface�� �޼ҵ� ������
	// �߻� �޼ҵ�� �ʼ��� ������ �ؾ� ��(���ϸ� ����)
	// ����Ʈ �޼ҵ�� ���������� ������ �� �� ����(���ص� ����X)
	
	// default �޼ҵ� ������
	@Override
	public void method2() {
		System.out.println("MyClassB���� ������(����Ʈ �޼ҵ�) - method2() ����");
	}

}
