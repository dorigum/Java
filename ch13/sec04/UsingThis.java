package ch13.sec04;

// ���ٽ� ���� ��Ͽ��� Ŭ���� ���(�ʵ�, �޼ҵ�)�� ���� ���� ���

public class UsingThis {
	public int outterField = 10;
	public int field = 100;

	class Inner {
		int innerField = 20;
		int field = 200;

		void method() {
			// ���ٽ�
			MyFunctionalInterface fi = () -> {
				// �ʵ���� �ٸ� ��� �ƹ� ���� ����
				System.out.println("outterField : " + outterField);
				System.out.println("innerField : " + innerField);

				// �ʵ���� ������ ���
				System.out.println("outter : " + field); // Inner Ŭ���� �ʵ� ��
				System.out.println("inner : " + field);	// Inner Ŭ���� �ʵ� ��
			
			// �ٱ� Ŭ���� �ʵ� ��� : Ŭ������.this ���
				System.out.println("outter : " + UsingThis.this.field);
		
			
			// this�� ����� ��� : Inner Ŭ���� �ʵ尪
			// ���ٽĿ��� this : ���ٽ��� ������ ��ü�� ����
				System.out.println("outter : " + this.field);
			};

			fi.method();

		}
	}
}
