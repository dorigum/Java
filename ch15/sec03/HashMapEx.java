package ch15.sec03;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		/*		Map<String, Integer> map = new HashMap<String, Integer>();
				map.put("kim", 100);
				map.put("kim", 200);*/
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		map.put(new Student(1, "È«±æµ¿"), 95);
		map.put(new Student(1, "È«±æµ¿"), 95);
		
		System.out.println("ÃÑ Entry ¼ö : " + map.size());
	}

}
