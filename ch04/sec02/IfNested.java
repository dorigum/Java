package ch04.sec02;

import java.util.Scanner;

// ��ø if�� : if�� ��� �ȿ� �Ǵٸ� if�� ����

public class IfNested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, pay;
		
		System.out.print("��ȣ �Է� (1. ���� 2. ī��) :");
		num = sc.nextInt();
		
		if(num == 1 || num == 2) {
			// ����� �Է��� ���
			System.out.print("���Ҿ� �Է� :");
			pay = sc.nextInt();
			
			if(num == 1) {
				System.out.println("���ξ� 10%");
				System.out.println("���ξ� :" + (int) (pay * 0.1) + " ��");
				//System.out.println("���ξ� :" + (int) (pay / 10) + " ��");
			} else {
				System.out.println("���ξ� 5%");
				System.out.println("���ξ� :" + (int) (pay / 20) + " ��");
			}
			
		} else { // �߸� �Է��� ���
			System.out.println("�߸� �Է��Ͽ����ϴ�. �����մϴ�.");
			}

	}

}
