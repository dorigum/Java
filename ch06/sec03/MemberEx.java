package ch06.sec03;

import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, name, phone, address;
		int age;
		
		Member m1 = new Member("hkd","ȫ�浿",30,"010-1234-5678","���� ������ ��ġ��");
		m1.showMember();
		
		System.out.print("-------------------------------\n");
		
		System.out.print("���̵� �Է� : ");
		id = sc.next();
		
		System.out.print("���� �Է� : ");
		name = sc.next();
		
		System.out.print("���� �Է� : ");
		age = sc.nextInt();
		
		System.out.print("��ȭ��ȣ �Է� : ");
		phone = sc.next();
		
		System.out.print("�ּ� �Է� : ");
		address = sc.next();
		
		Member m2 = new Member(id, name, age, phone, address);
		m2.showMember();
		
		sc.close();

	}

}
