package ch07.sec03;

public class People {
	// �ʵ� : name, ssn
	private String name;
	private String ssn;
	
	// �����ڿ��� �ʱ�ȭ : �Ű������� ���� �޾Ƽ�
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	// toString() ��� ���
	@Override
	public String toString() {
		return "name : " + name + ", ssn : " + ssn;
	}
	
}


// People Ŭ������ ��� �޴� Student Ŭ���� ����
// �ʵ� : stdNo
// ������ �ʱ�ȭ : �Ű������� ���� �޾Ƽ�
// �θ� �����ڿ��� �Ű����� ����
// toString() ��� ���

// ���� Ŭ���� : StudentEx