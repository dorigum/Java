package ch04.sec02;

import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		if(num % 2 == 1)
			System.out.println("Ȧ��");
		
		else
			System.out.println("¦��");

		sc.close();
	}

}
