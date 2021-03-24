package ch15.sec02;

import java.util.HashMap;
import java.util.Scanner;

// ����, �ѱ� �ܾ ������ �ؽøʿ� �����ϰ�,
// ����� �ѱ��� �˻��ϴ� ���α׷� �ۼ�
// exit �Է��ϸ� ����

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();

		// 6���� (key, value) ���� dic�� ����
		dic.put("apple", "���");
		dic.put("summer", "����");
		dic.put("candy", "����");
		dic.put("school", "�б�");
		dic.put("bus", "����");
		dic.put("water", "��");
		
		// ����ڷκ��� ���� �ܾ �Է� �ް� �ѱ� �ܾ� �˻�
		// "exit" �Է� ������ ����
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("ã�� ���� �ܾ��?");
		String eng = scanner.next();
		if(eng.equals("exit")) {
			System.out.println("�����մϴ�.");
			break;
		}
		
		// �ؽøʿ��� 'Ű' eng�� '��' kor �˻�
		String kor = dic.get(eng);
		if (kor == null)
		System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
		else
		System.out.println(kor);
		
		}
	}
}
