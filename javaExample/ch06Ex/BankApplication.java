package javaExample.ch06Ex;

import java.util.Scanner;

public class BankApplication {
	// 6��_20��
	private static Account2[] accountArray = new Account2[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1. ���� ���� | 2. ���� ��� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("----------------------------");
			System.out.println("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

	// ���� �����ϱ�
	private static void createAccount() {
		System.out.println("-------------------");
		System.out.println("���� ����");
		System.out.println("-------------------");

		System.out.println("���¹�ȣ : ");
		String ano = scanner.next();

		System.out.println("������ : ");
		String owner = scanner.next();

		System.out.println("�ʱ� �Աݾ� : ");
		int balance = scanner.nextInt();

		Account2 newAccount = new Account2(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}

	// ���� ��� ����
	private static void accountList() {
		System.out.println("-------------------");
		System.out.println("���� ���");
		System.out.println("-------------------");
		for (int i = 0; i < accountArray.length; i++) {
			Account2 account = accountArray[i];
			if (account != null) {
				System.out.print(account.getAno());
				System.out.print("       ");
				System.out.print(account.getOwner());
				System.out.print("       ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}

	// �����ϱ�
	public static void deposit() {
		System.out.println("-------------------");
		System.out.println("����");
		System.out.println("-------------------");
		System.out.println("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.println("���ݾ� : ");
		int money = scanner.nextInt();
		Account2 account = findAccount(ano);

		if (account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("��� : ������ �����Ǿ����ϴ�.");
	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("----------------");
		System.out.println("���");
		System.out.println("----------------");
		System.out.println("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.println("��ݾ� : ");

		int money = scanner.nextInt();
		Account2 account = findAccount(ano);

		if (account == null) {
			System.out.println("��� : ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("��� : ����� �����Ǿ����ϴ�.");
	}

	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account2 findAccount(String ano) {
		Account2 account = null;
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if (dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}

		return account;

	}
}
