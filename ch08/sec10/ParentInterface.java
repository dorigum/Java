package ch08.sec10;

// ����Ʈ �޼ҵ尡 �ִ� �������̽� ���
// �θ� �������̽��� ����Ʈ �޼ҵ带 �ڽ� �������̽����� Ȱ���ϴ� ���(3����)
// (1) ����Ʈ �޼ҵ带 �ܼ��� ��Ӹ� �޾Ƽ� ���					-- ChildInterface1
// (2) ����Ʈ �޼ҵ带 ������(Override)�ؼ� ���� ������ ���� �� ���	-- ChildInterface2
// (3) ����Ʈ �޼ҵ带 �߻� �޼ҵ�� �缱���ؼ� ���					-- ChildInterface3

public interface ParentInterface {
	public void method1(); // �߻� �޼ҵ�
	
	// ����Ʈ �޼ҵ�
	public default void method2() {
		System.out.println("ParentInterface�� ����Ʈ �޼ҵ� method2() ����");
	}
}
