// ������

package ch06.sec01;

import java.util.Scanner;

public class Product {
	String prdName;
	int prdPrice;
	int prdSold;
	int prdStock;
	
	public void inputPrdInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****��ǰ ���� �Է�*****");
		
		System.out.print("��ǰ�� : ");
		prdName = sc.next();
		
		System.out.print("���� : ");
		prdPrice = sc.nextInt();
		
		System.out.print("�Ǹ� ���� : ");
		prdSold = sc.nextInt();
		
		System.out.print("��� ���� : ");
		prdStock = sc.nextInt();
		
		sc.close();
		
	}
	
	public void showPrdInfo() {
		System.out.println("\n*****��ǰ ���� ���*****");
		
		System.out.println("��ǰ�� : " + prdName);
		System.out.println("���� : " + prdPrice);
		System.out.println("�Ǹ� ���� : " + prdSold);
		System.out.println("��� ���� : " + prdStock);
		
		
		System.out.println("���� : " + prdStock);
		
	}
	
	public void salesAmount() {
		System.out.println("����� : " + (prdPrice*prdSold));
	}
	
	public void stockAmount() {
		System.out.println("���� : " + (prdPrice*prdStock));
	}
	
}

