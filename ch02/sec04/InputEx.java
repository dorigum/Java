package ch02.sec04;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String name;
		int year;
		float score;
		String grade;
		//char grade;
		
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		
		System.out.print("�г� �Է� : ");
		year = sc.nextInt();
		
		System.out.print("���� �Է� : ");
		score = sc.nextFloat();

		System.out.print("���� �Է� : ");
		grade = sc.next();
		//String g = sc.next();
		//grade = g.charAt(O); charAt(O) : ���ڿ����� ù��° ���� ��ȯ
		
		System.out.println("---------------------");
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + year);
		System.out.println("���� : " + score);
		System.out.println("���� : " + grade);

		sc.close();
		
	}

}
