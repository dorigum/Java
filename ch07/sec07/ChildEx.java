package ch07.sec07;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		// �θ� Ŭ���� Ÿ�� ������ �ڽ� Ŭ���� ��ü ����
		Parent parent = child;	// �ڵ� Ÿ�� ��ȯ �߻�
		// parent ������ child ��ü�� ����������
		// Parent ����� ��� ����
		
		
		// Parent �޼ҵ� ��� ����
		parent.method1();
		
		// child ��ü�� ���������� Child ����� ����� �� ����.
		//parent.method3();	// ȣ�� �Ұ���

		parent.method2(); // �����ǵ� Child �޼ҵ� ȣ��
		// Parent Ÿ������ Parent Ŭ������ method2()�� �����Ϸ��� ���ϱ�
		// Child Ŭ������ ������ �Ǿ� �ִ� ���� Ȯ��
		// �׷��� �θ� ����� ȣ������ �ʰ�, �ڽĿ� �����ǵ� ��� �޼ҵ带 ȣ��
	}

}
