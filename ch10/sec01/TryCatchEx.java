package ch10.sec01;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

		String data1 = "100";
		String data2 = "a100";	// ���� ������ �ƴϹǷ� ������ �߻�!

		try {	// ���ܰ� �߻��� ���ɼ��� �ִ� ���� ��ġ
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
				System.out.println("��� : " + result);
			
		} catch (Exception e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�.");
		} finally {
			System.out.println("�����մϴ�.");
		}

	}

}
