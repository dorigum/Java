package projectEx2;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNum;

		System.out.println("****************************************");
		System.out.println("\t��ǰ ���� ���α׷�");
		System.out.println("****************************************");

		System.out.println("\t���� �޴����� ����");
		System.out.println("****************************************");
		System.out.println("1. ��ǰ ���");
		System.out.println("2. ��ǰ ���� ��ȸ");
		System.out.println("3. ��ǰ ���� ����");
		System.out.println("4. ��ǰ ���� ����");
		System.out.println("5. ����");
		System.out.println("****************************************");

		System.out.print("�޴� ��ȣ �Է� : ");
		menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			ItemInsert iis = new ItemInsert();
			iis.insert();
			break;
		case 5:
			System.out.println("----------------------------");
			System.out.println("�����մϴ�.");
		}

		sc.close();

	}
}