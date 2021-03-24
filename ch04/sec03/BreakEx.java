package ch04.sec03;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int withdrawal, balance=100000;
		
		System.out.println("현재 잔액 : " + balance);
		
		while(true) {
			System.out.println("인출액 입력 : ");
			withdrawal = sc.nextInt();
		
			
		if(withdrawal<=balance)
			balance=sc.nextInt();
		else {
			System.out.println("잔액 부족. 현재 잔액 : " + balance);
			break;
		}
		
		}
		
		sc.close();

	}

}
