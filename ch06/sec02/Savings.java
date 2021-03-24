package ch06.sec02;

import java.util.Scanner;

public class Savings {
	String name;
	int deposit;
	int interest;
	int balance;
	
	public void setName() {
		name = "홍길동";
	}
	
	public void setBalance() {
		balance = 10000;
	}
		
	public String getName() {
		return name;
	}	
	
	// 예금액 입력 받아 잔액 계산
	public void inputDeposit() {
		Scanner sc = new Scanner(System.in);
		System.out.print("예금액 입력 : ");
		deposit = sc.nextInt();
		balance += deposit;
		sc.close();
	}
	
	// 이자를 구하여 잔액을 계산하고 이자를 반환
	public int getInterest() {
		interest = (int)(balance * 0.1);
		balance += interest;
		return interest;
	}
	
	// 잔액 반환
	public int getBalance() {
		return balance;
	}
}
