package ch10.sec02;

// ���� ó�� ���ѱ��
// throws : �޼ҵ忡�� ó������ ���� ���ܸ� ȣ���� ���� ���ѱ�� ������ �Ѵ�.
// throws�� ���� �޼ҵ�� �ݵ��!! try ��� ������ ȣ��Ǿ�� �ϰ�
// catch ��Ͽ��� ���� ó���� �ؾ� �Ѵ�.

public class Throws {

	public static void main(String[] args) {
		try {
			findClass();	// throws�� ���� �޼ҵ带 ȣ��(�ݵ�� try ��� �ȿ��� ȣ��)
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");	// ���� ó��
		}

	}
	
	// findClass() �޼ҵ带 ȣ���� ������ ���� ó���� �� �ѱ�
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}

}
