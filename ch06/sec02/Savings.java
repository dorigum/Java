package ch06.sec02;

import java.util.Scanner;

public class Savings {
	String name;
	int deposit;
	int interest;
	int balance;
	
	public void setName() {
		name = "ȫ�浿";
	}
	
	public void setBalance() {
		balance = 10000;
	}
		
	public String getName() {
		return name;
	}	
	
	// ���ݾ� �Է� �޾� �ܾ� ���
	public void inputDeposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ݾ� �Է� : ");
		deposit = sc.nextInt();
		balance += deposit;
		sc.close();
	}
	
	// ���ڸ� ���Ͽ� �ܾ��� ����ϰ� ���ڸ� ��ȯ
	public int getInterest() {
		interest = (int)(balance * 0.1);
		balance += interest;
		return interest;
	}
	
	// �ܾ� ��ȯ
	public int getBalance() {
		return balance;
	}
}
