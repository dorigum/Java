package ch06.sec02;

import java.util.Scanner;

public class CircleEx {

	public static void main(String[] args) {
		// Circle Ŭ���� ��ü ����
		Circle c = new Circle();
		
		// ������ ���� �Է� ����
		Scanner sc = new Scanner(System.in);
		int radius;
		
		System.out.print("������ �Է� : ");
		radius = sc.nextInt();
		
		// setCircle() �޼ҵ忡�� ������ ���� �����ϰ�
		// ����� �޾Ƽ� ���
		// �� ���� : ...
		c.setCircle(radius);
		System.out.println("�� ���� : " + c.area());
		
		sc.close();

	}

}
