package projectEx;

import java.util.Scanner;

// �޴� ���

public class MainMenu {
	public static void main(String[] args) {
		// �޴� ���
		// ���õ� �޴��� ���� �ش� Ŭ������ �޼ҵ� ȣ��
		Scanner sc = new Scanner(System.in);
		int menuNum;

		System.out.println("****************************************");
		System.out.println("\t���� ���� ���α׷�");
		System.out.println("****************************************");

		System.out.println("\t���� �޴����� ����");
		System.out.println("****************************************");
		System.out.println("1. ���� ���");
		System.out.println("2. ���� ���� ��ȸ");
		System.out.println("3. ���� ���� ����");
		System.out.println("4. ���� ���� ����");
		System.out.println("5. ����");
		System.out.println("****************************************");

		System.out.println("�޴� ��ȣ �Է� : ");
		menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			BookInsert bis = new BookInsert();
			bis.insert();
			break;
		case 5:
			System.out.println("----------------------------");
			System.out.println("�����մϴ�.");
		}

		sc.close();

	}
}