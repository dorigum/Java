package ch05.sec01;

// ���ڿ� �� : equals() �޼ҵ� ���
// ��ü ���� �� : == ���

public class StringEquals {

	public static void main(String[] args) {
		String strVal1 = "ȫ�浿";
		String strVal2 = "ȫ�浿";
		
		// ������ ��ü�� �����ϴ��� ����
		if(strVal1 == strVal2) {
			System.out.println("strVal1�� strVal2�� ������ ����");
		} else {
			System.out.println("strVal1�� strVal2�� ������ �ٸ�");
		}
		
		// ���ڿ��� ������ ��
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1�� strVal2�� ���ڿ��� ����");
		}
		
		
		
		
		String strVal3 = new String("ȫ�浿");
		String strVal4 = new String("ȫ�浿");
		
		
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1�� strVal2�� ������ ����");
		} else {
			System.out.println("strVal1�� strVal2�� ������ �ٸ�");
		}
		
		// ���ڿ��� ������ ��
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1�� strVal2�� ���ڿ��� ����");
		}
		
		
	}

}
