package ch04.sec03;

import java.util.Scanner;

public class ForEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int jjak=0, hol=0, zero=0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("����" + i + " �Է� : ");
			num = sc.nextInt();
			if(num>0)
				jjak++;
			else if(num<0)
				hol++;
			else
				zero++;
		}
		
		System.out.println("\n���� ���� : " + jjak);
		System.out.println("���� ���� : " + hol);
		System.out.println("0�� ���� : " + zero);
		
		
		sc.close();

	}

}
