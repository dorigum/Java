package ch03.sec04;

import java.util.Scanner;

public class ArithmeticOperatorEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math, total;
		float average;
		
		System.out.print("���� ���� �Է� : ");
		kor = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		eng = sc.nextInt();
		
		System.out.print("���� ���� �Է� : ");
		math = sc.nextInt();
		
		total = kor + eng + math;
		average = total / 3f; // �Ǵ� 3.0f
		
		
		System.out.println("-----------------");
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);

		sc.close();
		
		
	}

}
