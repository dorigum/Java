package ch04.sec03;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int withdrawal, balance=100000;
		
		System.out.println("���� �ܾ� : " + balance);
		
		while(true) {
			System.out.println("����� �Է� : ");
			withdrawal = sc.nextInt();
		
			
		if(withdrawal<=balance)
			balance=sc.nextInt();
		else {
			System.out.println("�ܾ� ����. ���� �ܾ� : " + balance);
			break;
		}
		
		}
		
		sc.close();

	}

}
