package ch15.sec02;

public class Employee {
	private int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + "-" + name + "-" + salary;
	}

}
