package ch10.sec01;

public class NumberFormatEx {

	public static void main(String[] args) {
		// ���� 100 : ��
		// ���ڿ� 100 : �Ͽ���
		String data1 = "100";
		String data2 = "a100";	// ���� ������ �ƴϹǷ� ������ �߻�!

		// ���ڿ��� ������ ��ȯ
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println("��� : " + result);
		
	}

}
