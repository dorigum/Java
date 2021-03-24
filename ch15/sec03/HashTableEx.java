package ch15.sec03;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		// ID와 비밀번호를 미리 저장
		map.put("spring", "1234");
		map.put("summer", "5678");
		map.put("fall", "1111");
		map.put("winter", "7777");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 비밀번호를 입력하세요.");
			System.out.print("ID : ");
			String id = sc.nextLine();
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.println();
			
			// ID인 키가 존재하는지 확인
			if(map.containsKey(id)) {
				// 비밀번호 확인
				if(map.get(id).equals(password)) {
					System.out.println("로그인 되었습니다!");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			} else {
				System.out.println("입력한 ID가 존재하지 않습니다.");
			}
		}
	}

}
