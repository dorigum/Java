package ch15.sec02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ArrayList ���
// 4���� �ܾ �Է¹ް�,
// ���� �� �ܾ�� ���̸� ����ϴ� ���α׷� �ۼ�

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();

		// Ű����κ��� 4���� �ܾ �Է� �޾� ArrayList�� ����
		Scanner scanner = new Scanner(System.in); // Scanner ��ü ����
		for (int i = 0; i < 4; i++) {
			System.out.println("�ܾ �Է��ϼ���>>");
			String s = scanner.next(); // Ű����κ��� �ܾ� �Է�
			a.add(s); // ArrayList �÷��ǿ� ����
		}

		System.out.println("-----------------------------------");

		// ArrayList�� ��� �ִ� ��� �ܾ� ���
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i); // ArrayList i��° ���ڿ� ������
			System.out.println(name + " ");
		}

		// ���� �� �̸� ���
		// length() �޼ҵ� ���
		int longestIndex = 0; // ���� ���� �� �ܾ �ִ� ArrayList ���� �ε���
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length()) // �ܾ� ���� ��
				longestIndex = i; // i��° �ܾ �� �� �ܾ�
		}

		System.out.println("\n���� �� �ܾ�� : " + a.get(longestIndex));
		System.out.println("���� �� �ܾ��� ���̴� : " + a.get(longestIndex).length());
		scanner.close();

		/*
		for (int i=0; i<get.length; i++){
		System.out.println("���� �� �ܾ�� : " + name);
		System.out.println("���� �� �ܾ��� ���̴� : " + @@@);
		}*/

	}

}
