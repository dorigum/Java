package ch02.sec03;

// ����Ŀ��� �ڵ� Ÿ�� ��ȯ
public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; // ������ ����
		// ���� ������ ��� : int Ÿ���� �⺻(4 byte)
		// 4����Ʈ���� ���� Ÿ�� (byte, char, short)��
		// intŸ������ ��ȯ�� �� ���� ����
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		// charŸ�� + charŸ�� : intŸ��
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; // ������ ����
		int intValue2 = charValue1 + charValue2;
		System.out.println("�����ڵ� : " + intValue2);
		System.out.println("��¹��� : " + (char)intValue2);

	}

}
