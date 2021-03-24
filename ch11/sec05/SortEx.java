package ch11.sec05;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		// ������ �迭 ����
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for(int i=0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}

		System.out.println();
		
		
		// ���ڿ� �迭 ����
		String[] names = {"ȫ�浿", "�̸���", "������"};
		Arrays.sort(names);
		for(int i=0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i]);
		}
		
		System.out.println();
		
		// ����� ���� Ŭ���� �迭 ����
		// (Comparable �������̽��� �����ؾ߸� ���� ����)
		Member m1 = new Member("ȫ�浿");
		Member m2 = new Member("�̸���");
		Member m3 = new Member("������");
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);	// Ŭ������ Comparable �������̽��� �����ϰ� �־�� ������ �ȴ�.
		
		for(int i=0; i<members.length; i++) {
			System.out.println("members[" + i + "].name = " + members[i].name);
			
		}
		
	}

}
