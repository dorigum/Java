package ch02.sec02;
// ������ Ÿ��

public class DataType {

	public static void main(String[] args) {
		// ���� Ÿ�� ���� ���� �� �ʱ�ȭ
		char a = 'A';
		char b = '\u0041';
		char c = 65;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("----------------------------");
		
		// ���� Ÿ�� ���� ���� �� �ʱ�ȭ
		int byteValue = 10;					// 1����Ʈ ����
		int shortValue = 1000;				// 2����Ʈ ����
		int intValue = 2100100100;			// 4����Ʈ ����
		long longValue = 100010001000100L;	// 8����Ʈ ����
		
		System.out.println("byteValue : " + byteValue);
		System.out.println("shortValue : " + shortValue);
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : " + longValue);
		
		System.out.println("----------------------------");

		// �Ǽ� Ÿ�� ���� ���� �� �ʱ�ȭ
		double doubleValue = 0.1234567890123456789; // 8����Ʈ �Ǽ�(�� ������)
		float floatValue = 0.1234567890123456789f;	// 4����Ʈ �Ǽ� : f �Ⱥ��̸� ����
		
		System.out.println("doubleValue : " + doubleValue);
		System.out.println("floatValue : " + floatValue);

		System.out.println("----------------------------");

		// ���� ǥ�� : e ����ϱ�
		int var1 = 3000000;		
		double var2 = 3e6;		// 0�� 6��
		float var3 = 3e6f;		// float�̹Ƿ� f ����
		double var4 = 2e-3;		// -3 : �Ҽ��� ���� 3�ڸ�
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);

		System.out.println("----------------------------");

		//�� Ÿ�� ���� ���� �� �ʱ�ȭ
		boolean booleanValue = true;
		System.out.println("booleanValue : " + booleanValue);
		
		System.out.println("----------------------------");

		// String Ÿ��(���ڿ�) ���� ���� �� �ʱ�ȭ
		String name = "ȫ�浿";
		System.out.println("name : " + name);
		

	}

}
