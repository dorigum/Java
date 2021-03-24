package ch11.sec03;

import java.util.StringTokenizer;

// ���ڿ� �и� ���
//(2) java.util.StringTokenizer Ŭ���� ���

public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "ȫ�浿/�̸���/������";

		// ���1 : ��ü ��ū ���� �� for������ �ݺ�
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		
		System.out.println("--------------------");

		
		// ���2 : �����ִ� ��ū�� Ȯ���ϰ�, ������ ��� �ݺ� ����(while�� ���)
		st = new StringTokenizer(text, "/");
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}