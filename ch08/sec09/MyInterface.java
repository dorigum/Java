package ch08.sec09;

public interface MyInterface {
	public void method1();	// �߻� �޼ҵ�
	// ���ο� �޼ҵ� �߰� �ʿ�
	// �߻� �޼ҵ�� �߰��ϸ�
	// ������ �� �������̽��� ������ Ŭ��������
	// ���� �߰��� ��� �߻� �޼ҵ带 ������ �ؾ��Ѵ�.(���ϸ� ����)
	//public void method2();	// �߻� �޼ҵ�� �߰����� �ʰ�
	
	// ����Ʈ �޼ҵ�� �߰�
	// default �޼ҵ� : �ٵ� �ִ�. (���� ����� ������ �ִ� �޼ҵ�)
	public default void method2() {
		System.out.println("MyInterface-method2() ����");
	}
}
