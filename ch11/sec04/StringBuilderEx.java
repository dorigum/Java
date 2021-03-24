package ch11.sec04;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		// append() : ���� �߰�
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());

		// insert(��ġ, ���ڿ�) : Ư�� ��ġ�� ���ڿ� ����
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		// setCharAt(��ġ, ���� 1��) : Ư�� ��ġ�� ���� ����(����)
		// �� ���ڿ��� ��ü(��ġ)
		sb.setCharAt(4,'6');
		System.out.println(sb.toString());
		
		// replace(����, ��) : ���ۺ��� ��-1 ������ ���ڿ���
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		// delete(start, end) : start���� start-1 ���� ���ڿ� ����
		sb.delete(4 , 5);	// 4���� 4���� - 4��ġ 1�� ����
		System.out.println(sb.toString());
		
		
		int length = sb.length();
		System.out.println("�� ���� �� : " + length);
		
		String result = sb.toString();
		System.out.println(result);
		
	}

}
