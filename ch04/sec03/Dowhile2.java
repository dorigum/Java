package ch04.sec03;

import java.util.Scanner;

public class Dowhile2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		String answer = "";
		
		System.out.println("���� �ȳ� ���α׷�");
		
		do {
			System.out.println("\n1~4 ��ȣ �Է� : ");
			input = sc.nextInt();
			
			switch(input) {
			case 1 : System.out.println("Java ���α׷���"); break;
			case 2 : System.out.println("�����ͺ��̽�"); break;
			case 3 : System.out.println("������ �м�"); break;
			case 4 : System.out.println("AI"); break;
			default : System.out.print("�߸� �Է��Ͽ����ϴ�.");
		}
		
			System.out.print("\n��� �Է��Ͻðڽ��ϱ�? (y/n �Է�) : ");
			answer = sc.next();
		}	
		
			while(answer.contentEquals("y")); // 5�� �ƴϸ� �ݺ�

			System.out.print("�����մϴ�.");
			sc.close();

		}

}
