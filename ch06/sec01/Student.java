
package ch06.sec01;

import java.util.Scanner;

public class Student {
	
	String stdNo;
	String stdName;
	int year;
	int score;

	public void inputStdInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*****�л� ���� �Է�*****");
		
		System.out.print("�й� : ");
		stdNo = sc.next();
		
		System.out.print("���� : ");
		stdName = sc.next();
		
		System.out.print("�г� : ");
		year = sc.nextInt();
		
		System.out.print("���� : ");
		score = sc.nextInt();
		
		sc.close();
		
	}
	
	public void showStdInfo() {
		System.out.println("\n*****�л� ���� ���*****");
		
		System.out.println("�й� : " + stdNo);
		System.out.println("���� : " + stdName);
		System.out.println("�г� : " + year);
		System.out.println("���� : " + score);
		
	}

}
