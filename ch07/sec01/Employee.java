package ch07.sec01;

// �θ� Ŭ���� : ���� Ŭ����

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	private String empNo;
	private String empName;
	private String part;
	
	public void setEmployee() {
		System.out.print("��� �Է� : ");
		empNo = sc.next();
		
		System.out.print("���� �Է� : ");
		empName = sc.next();
		
		System.out.print("�μ� �Է� : ");
		part = sc.next();
	}
	
	public void showEmpInfo() {
		System.out.println("\n��� : " + empNo);
		System.out.println("���� : " + empName);
		System.out.println("�μ� : " + part);
		
	}
	
}
