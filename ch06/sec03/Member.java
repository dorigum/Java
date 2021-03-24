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
		System.out.println("-----회원 정보 입력-----");
		System.out.println("ID : " + id);
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전화 : " + phone);
		System.out.println("주소 : " + address);

	}
}
