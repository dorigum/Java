package ch06.sec03;

public class Member {
	String id, name, phone, address;
	int age;

	public Member(String id, String name, int age, String phone, String address) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public void showMember() {
		System.out.println("-----ȸ�� ���� �Է�-----");
		System.out.println("ID : " + id);
		System.out.println("���� : " + name);
		System.out.println("���� : " + age);
		System.out.println("��ȭ : " + phone);
		System.out.println("�ּ� : " + address);

	}
}
