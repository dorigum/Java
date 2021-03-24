package ch15.sec02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {
		// HashSet
		// Employee Ŭ����
		// 3�� ����
		// Iterator ����ؼ� ���

		HashSet<Employee> set = new HashSet<Employee>();

		Employee e1 = new Employee(100, "�����", 88000.99);
		Employee e2 = new Employee(100, "�ڰ���", 77000.99);
		Employee e3 = new Employee(100, "�̴븮", 66000.99);

		set.add(e1);
		set.add(e2);
		set.add(e3);

		System.out.println(set.size());

		Iterator<Employee> it = set.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp);
		}

		Iterator<Employee> it2 = set.iterator();
		while (it2.hasNext()) {
			Employee emp = it2.next();
			System.out.println(emp.name);

		}
	}
}
