package ch15.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");

		int size = list.size();
		System.out.println("�� ��ü �� : " + size);

		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

		System.out.println();

		System.out.println("2 : " + list.get(2));
		
		list.remove(2); // 2�� ��ġ�ߴ� DataBase ���ŵ�
		list.remove(2);	// 2�� ����� Servlet/JSP ���ŵ�
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}

	}

}
