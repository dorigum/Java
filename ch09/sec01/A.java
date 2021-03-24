package ch09.sec01;

// ��ø Ŭ����(���� ��ġ�� ���� �з�)
// 1. ��� Ŭ���� : Ŭ���� ����μ� ����Ǵ� Ŭ����(�ʵ�/�޼ҵ� ���� ��ġ�� ����)
// 	(1) �ν��Ͻ� ��� Ŭ���� : �ٱ� Ŭ����(A) ��ü�� �����ؾ߸� ��� ����
//	(2) static ��� Ŭ���� : �ٱ� Ŭ����(A)�� �ٷ� ���� ����(��ü ���� �ʿ� ����)
// 2. ���� Ŭ���� : �޼ҵ� ���ο� ����Ǵ� Ŭ����
//	-�޼ҵ尡 ���� �� ���� ��� ����

public class A {
	A (){ System.out.println("A ��ü ����");}
	
	// �ν��Ͻ� ��� Ŭ����
	public class B{
		B(){ System.out.println("B ��ü ����");}
		// �ʵ� ����
		int field1;	// �ν��Ͻ� �ʵ�
		//static int field2;	// static �ʵ� ���� �Ұ�
		
		// �޼ҵ� ����
		void method1() { System.out.println("B Ŭ������ method1() ����");}	// �ν��Ͻ� �޼ҵ�
		//static void method2() {}	// static �޼ҵ� ���� �Ұ�
	}
	
	/*static ��� Ŭ����*/
	static class C{
		// ������
		C(){ System.out.println("C ��ü ����");}
		// �ν��Ͻ� �ʵ�� �޼ҵ�, static �ʵ�� �޼ҵ� ���� ����
		// �ʵ�
		int field1;
		static int field2;
		void method1() {System.out.println("C Ŭ������ method1() ����");}
		static void method2() {System.out.println("C Ŭ������ method2() ����");}		
	}
	
	// A Ŭ������ ��� �޼ҵ�
	void method() {
		// ���� Ŭ���� : �޼ҵ� ������ ����
		// �޼ҵ� ������ ��ü�� �����ϰ� ����ؾ� ��
		class D{
			D(){ System.out.println("D ��ü ����");}
			// �ʵ�
			int field1;
			//static int field2;	// static �ʵ� ���� �Ұ�
			// �޼ҵ�
			void method1() { System.out.println("D Ŭ������ method1() ����");}
			//static void method2() {}	// static �޼ҵ� ���� �Ұ�
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		
	}
	
}









