package ch07.sec03;

public class Employee {
	private String empNo;
	private String empName;
	private String empPart;
	
	
	// 매개변수가 3개 있는 생성자
	// 자식 클래스의 생성자로부터 매개변수로 전달 받아서
	// 필드를 초기화
	
	public Employee(String empNo, String empName, String empPart) {
		this.empNo = empNo;
		this.empName = empName;
		this.empPart = empPart;
	}


	@Override
	public String toString() {
		return "사번 : " + empNo +
				"\n성명 : " + empName +
				"\n부서 : " + empPart;
	}
	
	
		
}
