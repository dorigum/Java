package ch15.sec03;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		// ID�� ��й�ȣ�� �̸� ����
		map.put("spring", "1234");
		map.put("summer", "5678");
		map.put("fall", "1111");
		map.put("winter", "7777");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID�� ��й�ȣ�� �Է��ϼ���.");
			System.out.print("ID : ");
			String id = sc.nextLine();
			
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.println();
			
			// ID�� Ű�� �����ϴ��� Ȯ��
			if(map.containsKey(id)) {
				// ��й�ȣ Ȯ��
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�!");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
				
			} else {
				System.out.println("�Է��� ID�� �������� �ʽ��ϴ�.");
			}
		}
	}

}
