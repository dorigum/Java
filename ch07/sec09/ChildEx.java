package ch07.sec09;

public class ChildEx {

	public static void main(String[] args) {
		// Parent Ÿ�� ������ Child ��ü ����
		Parent parent = new Child();	// �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ �߻�
		// Parent ����� ��� ����
		parent.f1 = "data1";
		parent.method1();
		parent.method2();
		
		// Parent Ÿ������ ��ȯ�� �Ŀ���
		// Child Ŭ������ ��� ��� �Ұ�
		//parent.f2 = "data2";
		//parent.method3();

		// �ٽ� Child Ÿ������ ��ȯ : ���� Ÿ�� ��ȯ
		Child child = (Child) parent;
		child.method3();	// Child Ŭ���� ��� ��� ����
		
	}

}
