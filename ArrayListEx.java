package ch15.sec01;

import java.util.ArrayList;

// ArrayList
// ���׸� Ÿ���� �ƴ� ���

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(5);

		list.add(100); // int Ÿ�� �����͸� Integer Ÿ������ �ڵ� ��ȯ
		list.add(new Integer(200)); // Integer Ÿ�� ��ü
		list.add(2.5);
		list.add(new Double(3.14)); // Double Ÿ�� ��ü
		list.add("�ڹ� ���α׷�");

		list.add(0, "����"); // 0�� �ε����� ����

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
