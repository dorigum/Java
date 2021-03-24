package ch11.sec04;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		// ���Խ� ���� : ��ȭ��ȣ ����
		// (02|010) 02 �Ǵ� 010
		// \\ : ��������(Ư������)
		// \d : �� ���� ����
		// {3,4} : 3���� ���� 4������
		// {4} : ��Ȯ�� 4��

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";

		// data�� ���Խ� regExp�� �´��� Ȯ��
		boolean result = Pattern.matches(regExp, data);
		if (result) { // result == true
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

		System.out.println("---------------------");

		// �̸��� ������ ���Խ� ����
		// \w : �� ���� ���ĺ� �Ǵ� �� ���� ���� [a-zA-Z_0-9]
		// \. : .
		// + : �� �� �̻�
		// () : �׷���
		// ? : 0�� �Ǵ� �� ��
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		// .com�� 2�������� ��ġ, 3�����ʹ� ��ġ���� X
		result = Pattern.matches(regExp, data);

		if (result) { // result == true
			System.out.println("���Խİ� ��ġ�մϴ�.");
		} else {
			System.out.println("���Խİ� ��ġ���� �ʽ��ϴ�.");
		}

	}

}
