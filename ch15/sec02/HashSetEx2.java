package ch15.sec02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {

	public static void main(String[] args) {
		// HashSet
		// Employee 클래스
		// 3명 저장
		// Iterator 사용해서 출력

		HashSet<Employee> set = new HashSet<Employee>();

		Employee e1 = new Employee(100, "김부장", 88000.99);
		Employee e2 = new Employee(100, "박과장", 77000.99);
		Employee e3 = new Employee(100, "이대리", 66000.99);

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
