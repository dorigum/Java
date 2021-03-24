package ch07.sec01;

public class Manager extends Employee {
	private String position;
	
	public void setManager() {
		setEmployee(); // 상위 클래스의 메소드 호출해서 입력 받음
		System.out.print("직위 입력 : ");
		position = sc.next();
		
	}
	
	public void showManagerInfo() {
		showEmpInfo();
		System.out.println("직위 : " + position);
	}
	
}
