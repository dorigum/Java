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
	// toString() �޼ҵ�
	// ��ü�� �ؽ�Ʈ �� �Ǵ� ���ڿ��� ����Ǵ� ������� ������ �� �ڵ����� ȣ��Ǵ� �޼ҵ�
	// ��ü�� ������ �ִ� ������ ���� ���ڿ� ���·� ��ȯ
}
