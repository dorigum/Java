package ch07.sec04.pack1;

// AA�� ���� ��Ű��
// ���� ��Ű�� ��������
// private �ʵ�� �޼ҵ带 �����ϸ�
// �ٸ� ��� �ʵ�� �޼ҵ� ���� ����

public class BBB {
	public BBB() {
		AAA a = new AAA();
		// �ʵ� ����
		a.field1 = 1;		// public (O)
		a.field2 = 1;		// default (O)
		//a.field3 = 1;		// private (X) : not visible
		// private�� �ܺο��� �������� �𸥴�.
		a.field4 = 1;		// protected (O)
		// ���� ��Ű������ protected ���� ����
		
		// �޼ҵ� ����
		a.method1();	// public (O)
		a.method2();	// default (O)
		//a.method3();	// private (X) : not visible
		a.method4();	// protected (O)
		
	}

}
