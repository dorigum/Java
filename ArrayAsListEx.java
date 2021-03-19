package ch15.sec01;

import java.util.Arrays;
import java.util.List;

// Arrays.asList() : ������ ��ü��� ������ List ����

public class ArrayAsListEx {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("ȫ�浿", "�̸���", "������");
		
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
