package ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("ȫ�浿", 85);
		map.put("�̸���", 90);
		map.put("������", 95);
		
		// Ű�� ������ �������� ������ ���� ��ü
		// Ű�� ������ ���� �޶�, ������ ������ ���� �� ����� ��µ�
		map.put("ȫ�浿", 90); 

		System.out.println("�� Entry �� : " + map.size());

		// ��ü ã�� : Ű(�̸�)�� ��(����) �˻�
		// map.get(key) -> value ��ȯ
		System.out.println("ȫ�浿 : " + map.get("ȫ�浿"));

		System.out.println();

		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet(); // key set ��ȯ
		// �ݺ��ؼ� Ű�� ��� ���� ������
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next(); // key�� �˾Ƴ���
			Integer value = map.get(key); // key value ������
			System.out.println(key + " : " + value);
		}

		System.out.println();

		// ��ü ����
		map.remove("ȫ�浿"); // remove(key)
		System.out.println("�� Entry �� : " + map.size());

		// ��ü ��ü ����
		map.clear();
		System.out.println("�� Entry �� : " + map.size());

	}

}
