package ch13.sec03;

// ���ϰ��� �ִ� ���ٽ�
// �Ű��� 2, 5�� �����ϰ�
// 2+5�� ����� �����ϴ� ���ٽ� �ۼ�
// ��� �޾Ƽ� ���

public class MyfunctionalInterfaceEx {

	public static void main(String[] args) {
		MyfunctionalInterface fi;

		// ���ϰ��� �ִ� ���ٽ� : �Ű����� 2��
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		// �޼ҵ� ȣ�� : ���ϰ� ����
		// ���� ���� ������ �ްų�
		int result = fi.method(2, 5);
		System.out.println(result);

		// �ٷ� ���
		System.out.println(fi.method(2, 5));

		// return���� �ִ� ���
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		// return���� �ִ� ��� �߰�ȣ {} ���� ����, return ���� ���� ����
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		// �ٸ� �޼ҵ� ȣ���ϴ� ���
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(3, 5));
	
	}
	
	public static int sum(int x, int y) {
		return (x + y);
		
	}
	
}
