package ch02.sec04;

import java.util.Scanner;

// �ڵ� import : Ctrl + Shift + O

// Scanner Ŭ������ �̿��� Ű �Է�

public class input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("ù��° ���� �Է� : ");
		num1 = sc.nextInt(); // �Է��� ���� ������ ��ȯ�ؼ� num1�� ����
		// ����� System.out.println(num1);
		
		System.out.print("�ι�° ���� �Է� : ");
		num2 = sc.nextInt(); // �Է��� ���� ������ ��ȯ�ؼ� num2�� ����
		// ����� System.out.println(num2);

		// �� ���� �� ���
		System.out.println("�� ���� �� : " + (num1 + num2));
		
		// �� ���� �� ���
		System.out.println("�� ���� �� : " + (num1 * num2));

		
		sc.close(); // ���ҽ� ���� ���� ���� �ݱ�
		
	}

}
