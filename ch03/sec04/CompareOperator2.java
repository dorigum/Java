package ch03.sec04;

import java.util.Scanner;

// �� ������
// ���ڿ� �� : equals() �޼ҵ� ���

public class CompareOperator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String pass = "1234";
		String userPass;
		
		System.out.print("��й�ȣ �Է� : ");
		userPass = sc.next();
		
		// ���ڿ� ��
		// == ������� �ʰ� equals() �޼ҵ� ���
		
		if(pass.contentEquals(userPass))
			System.out.print("PASS");
		else
			System.out.print("NO PASS");
		
		sc.close();

	}

}
