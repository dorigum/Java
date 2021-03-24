package ch14.sec05;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "���"); // ���� ����
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���");
		
		// �� ���� ���ϴ� ���׸� �޼ҵ� compare() ȣ��
		boolean result1 = Util.<Integer, String>compare(p1, p2); // Integer, String ���� ����

		if (result1) {
			System.out.println("���� ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		
		
		
		// user1, ȫ�浿
		// user2, ȫ�浿
		// ���ؼ� ��� ���
		Pair<String, String> p3 = new Pair<String, String>("user1", "ȫ�浿");
		Pair<String, String> p4 = new Pair<String, String>("user2", "ȫ�浿");
		
		boolean result2 = Util.compare(p3, p4); // Integer, String ���� ����
		
		if (result2) {
			System.out.println("���� ����Դϴ�.");
		} else {
			System.out.println("�ٸ� ����Դϴ�.");
		}
		
		
	}

}
