package ch06.sec06;

// final�ʵ� : �������� ���� ���� �ִ� �ʵ�
// ���� ������ �� ���� �ʵ�

public class Person {
	final String nation = "Korea"; // ���������� �ʱ�ȭ(���)
	final String ssn; // ������ �� �ο�
	String name;
	
	// ������
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
