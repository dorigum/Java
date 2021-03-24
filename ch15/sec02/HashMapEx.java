package ch15.sec02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("홍길동", 85);
		map.put("이몽룡", 90);
		map.put("성춘향", 95);
		
		// 키가 같으면 마지막에 저장한 값은 대체
		// 키는 같지만 값이 달라서, 마지막 값으로 덮어 쓴 결과가 출력됨
		map.put("홍길동", 90); 

		System.out.println("총 Entry 수 : " + map.size());

		// 객체 찾기 : 키(이름)로 값(점수) 검색
		// map.get(key) -> value 반환
		System.out.println("홍길동 : " + map.get("홍길동"));

		System.out.println();

		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // key set 반환
		// 반복해서 키를 얻고 값을 얻어오기
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next(); // key를 알아내서
			Integer value = map.get(key); // key value 얻어오기
			System.out.println(key + " : " + value);
		}

		System.out.println();

		// 객체 삭제
		map.remove("홍길동"); // remove(key)
		System.out.println("총 Entry 수 : " + map.size());

		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());

	}

}
