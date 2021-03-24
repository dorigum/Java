package javaExample.addEx;

public class Member {
	String id;
	String pass;
	String name;
	int age;
	String phone;
	String address;

	public Member(String id, String pass, String name, int age, String phone, String address) {

		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("%-10s\t|	%-6s\t|	%6s\t|	%3d\t|	%13s\t|	%-50s", id, pass, name, age, phone, address);
	}
}
