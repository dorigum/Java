package ch02.sec03;

// �ڵ� Ÿ�� ��ȯ : ���α׷� ���� ���� �ڵ������� Ÿ�� ��ȯ�� �Ͼ�� ��
// ���� ũ���� Ÿ���� ū ũ���� Ÿ�Կ� ����� �� �߻�

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("'��'�� �����ڵ� : " + intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

	}

}
