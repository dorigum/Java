package ch13.sec05;

// ���ٽĿ��� �޼ҵ��� �Ű����� �Ǵ� ���ú����� final Ư���� ������ �Ѵ�.
// final Ű���� �����ص� final Ư�� (Java 8����)

public class UsingLocalVariable {
	// �Ű������� ���� �޼ҵ�
	void method(int arg) { // �Ű����� arg�� final Ư���� ����
		int localVar = 40; // ���� ���� localVar�� final Ư���� ����
		//arg = 10;

		// ���ٽ�
		MyFunctionalInterface fi = () -> {
			// �Ű� ���� ���
			System.out.println("arg : " + arg);
			// ���� ���� ���
			System.out.println("localVar : " + localVar);
		};
		
		fi.method();
		
	}
}
