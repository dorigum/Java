package ch05.sec02;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// ���� �Է� : 5�� �Է�
		// ������ ��� ���
		// score, total, average
		// ���� �Է�
		// �л�1 : 95 ...
		// ���� : ...
		// ��� : ...

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int total = 0;
		float average;
		
		System.out.println("���� �Է�");
		for(int i=0; i<score.length; i++) {
			System.out.print("�л�" + (i+1) + ":");
			
			score[i] = sc.nextInt();
			total += score[i];
		
		}
		
		average = total/(float)score.length;
		System.out.println("\n����:" + total);
		System.out.println("���:" + average);
		
		sc.close();
	
	}

}
