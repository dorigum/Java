package ch07.sec02;

public class Employee {
	private String empNo;
	private String empName;
	private String part;
	
	public Employee(String empNo, String empName, String part) {
		this.empNo = empNo;
		this.empName = empName;
		this.part = part;
	}

	@Override
	public String toString() {
		//return "Employee [empNo=" + empNo + ""
		//		+ ", empName=" + empName + ", part=" + part + "]";
	
		return empNo + "\t|" + empName + "\t|" + part;
	
	
	
	}
	// toString() 메소드
	// 객체가 텍스트 값 또는 문자열이 예상되는 방식으로 참조될 때 자동으로 호출되는 메소드
	// 객체가 가지고 있는 정보나 값을 문자열 형태로 반환
}
