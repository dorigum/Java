package ch14.sec04;

public class BoxingMethodEx {

	public static void main(String[] args) {
		// ���1 : ȣ���� �� ��ü�� Ÿ�� ���
		Box<Integer> box1 = Util.<Integer>boxing(100); // <Integer> Ÿ������ ����ص� �ǰ�, ������ ����
		int intValue = box1.get();
		System.out.println(intValue);

		// ���2 : ��ü�� Ÿ�� ����
		// �Ű����� ���� ��ü�� Ÿ���� ����
		Box<String> box2 = Util.boxing("ȫ�浿"); // <String> ����
		String strValue = box2.get();
		System.out.println(strValue);

	}

}
