package ch10.sec01;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		// ���� 2�� �Է� �ް�
		// ������ ���� : 0���� ������ ����
		// ���� ó�� ���� : "0���� ���� �� �����ϴ�."
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("���� 1 �Է� : ");
		n1 = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		n2 = sc.nextInt();
		
		
		try {
			System.out.print("������ ��� : " + n1 / n2);
		} catch (ArithmeticException e) {
			System.out.print("0���� ���� �� �����ϴ�.");
		}
		sc.close();
	}

}
