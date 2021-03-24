package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

// �ٸ� ��Ű��
// ����� ��� protected �ʵ� ���� ����
// ����� ���� �ڽ� Ŭ������ private�� default�� ���� �Ұ�

public class DDD extends AAA {
	public DDD() {
		// ��� �޾����Ƿ� �θ��� �ʵ�� �޼ҵ� ��� ����
		// ��ü �������� �ʰ� ����
		field1 = 1;	// public (O)
		//field2 = 1;	// default (X)
		//field3 = 1;	// private (X)
		field4 = 1; // protected (O) : ����� ���, ���� ���� ����
		
		// �޼ҵ� ����
		method1();	// public (O)
		//method2();	// default (X)
		//method3();	// private (X)
		method4(); // protected (O) : ����� ���, ���� ���� ����
		
	}

}
