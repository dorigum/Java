package ch05.sec02;

import java.util.Scanner;

// �Է� �޾Ƽ� �迭�� ����

public class Array4 {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ���� �迭�� ���ڸ� �Է� �޾Ƽ� ����
		// ���� �Է�
		// num[0] : ...7
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("���� �Է�");
		for(int i=0; i<num.length; i++) {
		System.out.print("num[" + i + "] : ");
		num[i] = sc.nextInt();
		
		}
		
		// �迭�� �� ���
		// num[0] : ...7
		System.out.println("�Էµ� �� ���");
		for(int i=0; i<num.length; i++) {
		System.out.println("num[" + i + "]" + num[i]);

		}
		
		// �̸� �Է�
		// 5���� �̸��� �Է¹޾� ���
		// ũ�Ⱑ 5�� String �迭�� �̸��� �Է� �޾Ƽ� �����ϰ� ���
		String[] name = new String[5];
		
		System.out.println("�̸� �Է�");
		for(int i=0; i<name.length; i++) {
			System.out.print("name[" + i + "]");
			name[i] = sc.next();
		}
		
			System.out.println("�Էµ� �� ���");
			for(int i=0; i<name.length; i++) {
				System.out.println("name[" + i + "]" + name[i]);
			}
		
			
		}
	
}
