package ch15.sec02;

import java.util.ArrayList;

public class BookArrayListEx {

	public static void main(String[] args) {
		// ���� 5�� ����ϰ�, ���� ���� ���
		ArrayList<Book> list = new ArrayList<Book>(5);

		Book b1 = new Book("1001", "�ڹ�", "ȫ�浿", 20000, "2021-01-01", "�������ǻ�");
		Book b2 = new Book("1002", "���̽�", "�̸���", 22000, "2020-05-01", "�������ǻ�");
		Book b3 = new Book("1003", "C++", "������", 15000, "2020-11-11", "�������ǻ�");
		Book b4 = new Book("1004", "Spring", "��븮", 27000, "2021-03-01", "�������ǻ�");
		Book b5 = new Book("1005", "JSP", "�ڰ���", 30000, "2021-02-21", "������ǻ�");

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		System.out.println(list.size());

		// ��� ����
		// 1001 .......
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			System.out.println(book);

		}
	}

}
