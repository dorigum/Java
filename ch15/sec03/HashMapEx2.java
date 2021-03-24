package ch15.sec03;

import java.util.HashMap;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		
		phone.put("초등친구", new String[] {"010-1111-1111", "02-2222-2222", "fr1@naver.com"});
		phone.put("고등친구", new String[] {"010-1234-1234", "031-5678-5678", "fr2@naver.com"});
		phone.put("회사동기", new String[] {"010-9988-9988", "com@multi.com"});
		phone.put("회사상사", new String[] {"010-9988-9988", "041-7777-7777", "boss@multi.com"});
		phone.put("회사상사", new String[] {"010-0000-0000", "051-5555-5555", "b2@multi.com"});

		
		System.out.println("총 그룹 수 : " + phone.size());
		
		// 내 연락처 모든 정보 조회
		Set<String> keys = phone.keySet();
		for(String key : keys) {
			System.out.print(key + " : ");
			String[] phoneList = phone.get(key);
			for(String one : phoneList) {
				System.out.print(one + " | ");
				
			}
		}			
			System.out.println();
			
			// 회사 동기를 검색해서 출력
			System.out.println("회사 동기 검색 : ");
			if(phone.containsKey("회사동기")) {
				String[] phoneList = phone.get("회사동기");
				
				for(String one : phoneList) {
				System.out.println(one + " | ");
				}
			}
			
			System.out.println();
			
			// 사장님을 검색해서 출력
			System.out.println("회사 동기 검색 : ");
			if(phone.containsKey("사장님")) {
				String[] phoneList = phone.get("회사동기");
				
				for(String one : phoneList) {
				System.out.println(one + " | ");
				}
			} else {
				System.out.println("연락처 없음");
			}
			
	}
}