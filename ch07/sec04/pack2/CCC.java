package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

//�ٸ� ��Ű��
//�ٸ� ��Ű�������� public�� ���� ����

public class CCC {
	public CCC() {
		AAA a = new AAA();
		// �ʵ� ����
		a.field1 = 1;		// public (O)
		//a.field2 = 1;		// default (X) : ���� ��Ű�� �������� ���� ����
		//a.field3 = 1;		// private (X)
		//a.field4 = 1;		// protected (X)
		// �ٸ� ��Ű�������� ���� �Ұ�(����� �� ���� ���)
		
		// �޼ҵ� ����
		a.method1();		// public (O)
		//a.method2();		// default (X)
		//a.method3();		// private (X)
		///a.method4();		// protected (X)
		
	}
}
