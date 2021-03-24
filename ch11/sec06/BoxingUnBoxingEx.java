package ch11.sec06;

// �ڽ�(Boxing) : �⺻ Ÿ���� ���� ���� ��ü�� ����� ����
// ��ڽ�(Unboxing) : ���� ��ü���� �⺻ Ÿ���� ���� ���� ����

// �ڽ��ϴ� ���
// (1) ������ �̿�
// (2) valueOf() �޼ҵ� �̿�

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		// Boxing
		// (1) ������ �̿�
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		
		// (2) valueOf() �޼ҵ� �̿�
		Integer obj3 = Integer.valueOf("300");
		
		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}

}
