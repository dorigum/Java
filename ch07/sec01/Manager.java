package ch07.sec01;

public class Manager extends Employee {
	private String position;
	
	public void setManager() {
		setEmployee(); // ���� Ŭ������ �޼ҵ� ȣ���ؼ� �Է� ����
		System.out.print("���� �Է� : ");
		position = sc.next();
		
	}
	
	public void showManagerInfo() {
		showEmpInfo();
		System.out.println("���� : " + position);
	}
	
}
