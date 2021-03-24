package ch15.sec02;

import java.util.HashMap;
import java.util.Scanner;

// 영어, 한글 단어를 쌍으로 해시맵에 저장하고,
// 영어로 한글을 검색하는 프로그램 작성
// exit 입력하면 종료

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();

		// 6개의 (key, value) 쌍을 dic에 저장
		dic.put("apple", "사과");
		dic.put("summer", "여름");
		dic.put("candy", "사탕");
		dic.put("school", "학교");
		dic.put("bus", "버스");
		dic.put("water", "물");
		
		// 사용자로부터 영어 단어를 입력 받고 한글 단어 검색
		// "exit" 입력 받으면 종료
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("찾고 싶은 단어는?");
		String eng = scanner.next();
		if(eng.equals("exit")) {
			System.out.println("종료합니다.");
			break;
		}
		
		// 해시맵에서 '키' eng의 '값' kor 검색
		String kor = dic.get(eng);
		if (kor == null)
		System.out.println(eng + "는 없는 단어입니다.");
		else
		System.out.println(kor);
		
		}
	}
}
