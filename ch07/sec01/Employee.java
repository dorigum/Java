package ch07.sec01;

// 부모 클래스 : 상위 클래스

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);
	private String empNo;
	private String empName;
	private String part;
	
	public void setEmployee() {
		System.out.print("사번 입력 : ");
		empNo = sc.next();
		
		System.out.print("성명 입력 : ");
		empName = sc.next();
		
		System.out.print("부서 입력 : ");
		part = sc.next();
	}
	
	public void showEmpInfo() {
		System.out.println("\n사번 : " + empNo);
		System.out.println("성명 : " + empName);
		System.out.println("부서 : " + part);
		
	}
	
}
