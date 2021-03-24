package ch07.sec03;

public class Manager extends Employee {
	// �ʵ�
	private String position;
	
	// �Ű������� 4�� �ִ� ������
	// 3���� �θ� Ŭ������ �����ڿ��� �����ϰ�
	// 1���� �ڽ��� �ʵ� ������ ���
	
	public Manager(String empNo, String empName, String empPart, String position){
		// �θ� Ŭ������ ������ ȣ���ϸ鼭 �ʿ��� ������ŭ�� �Ű������� ����
		super(empNo, empName, empPart);
		this.position = position;
		
	}

	@Override
	public String toString() {
		// �θ� Ŭ������ toString() ȣ��
		// super ���۷��� : �θ� Ŭ������ ��ü�� ����Ű�� ���� ����
		return super.toString() +
				"\n���� : " + position;
	}

}
