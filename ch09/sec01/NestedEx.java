package ch09.sec01;

public class NestedEx {

	public static void main(String[] args) {
		// �ν��Ͻ� ��� Ŭ������ ����ϱ� ���ؼ���
		// A Ŭ������ü�� �����ϰ� B ��ü�� �����ؾ� ��
		A a = new A();
		
		// �ν��Ͻ� ��� Ŭ���� B ��ü ����
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		
		
		System.out.println("--------------------------");
		
		// static ��� Ŭ������ ��ü ����
		// �ν��Ͻ� ��� ���� : ��ü �ʿ�
		A.C c = new A.C();
		c.field1 =3;
		c.method1();
		
		// static ��� ���� : Ŭ������ ����
		A.C.field2 = 3;
		A.C.method2();

		
		
		System.out.println("--------------------------");

		// ���� Ŭ���� ��ü �����ϵ��� �޼ҵ� ȣ��
		a.method();
	}

}
