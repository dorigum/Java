package ch15.sec05;

import java.util.Scanner;

public class nextAndLineEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		//String name = sc.nextLine(); // ���Ⱑ ���ԵǾ� ���� ��� ex) ȫ �浿 -> ȫ �浿
		String name = sc.next(); // ���� �� ���ڱ����� ��� ex) ȫ �浿 -> ȫ
		
		System.out.println(name);

	}

}
