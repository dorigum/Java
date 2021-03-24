package ch15.sec03;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		
		phone.put("�ʵ�ģ��", new String[] {"010-1111-1111", "02-2222-2222", "fr1@naver.com"});
		phone.put("���ģ��", new String[] {"010-1234-1234", "031-5678-5678", "fr2@naver.com"});
		phone.put("ȸ�絿��", new String[] {"010-9988-9988", "com@multi.com"});
		phone.put("ȸ����", new String[] {"010-9988-9988", "041-7777-7777", "boss@multi.com"});
		phone.put("ȸ����", new String[] {"010-0000-0000", "051-5555-5555", "b2@multi.com"});

		
		System.out.println("�� �׷� �� : " + phone.size());
		
		// �� ����ó ��� ���� ��ȸ
		Set<String> keys = phone.keySet();
		for(String key : keys) {
			System.out.print(key + " : ");
			String[] phoneList = phone.get(key);
			for(String one : phoneList) {
				System.out.print(one + " | ");
				
			}
		}			
			System.out.println();
			
			// ȸ�� ���⸦ �˻��ؼ� ���
			System.out.println("ȸ�� ���� �˻� : ");
			if(phone.containsKey("ȸ�絿��")) {
				String[] phoneList = phone.get("ȸ�絿��");
				
				for(String one : phoneList) {
				System.out.println(one + " | ");
				}
			}
			
			System.out.println();
			
			// ������� �˻��ؼ� ���
			System.out.println("ȸ�� ���� �˻� : ");
			if(phone.containsKey("�����")) {
				String[] phoneList = phone.get("ȸ�絿��");
				
				for(String one : phoneList) {
				System.out.println(one + " | ");
				}
			} else {
				System.out.println("����ó ����");
			}
			
	}
}