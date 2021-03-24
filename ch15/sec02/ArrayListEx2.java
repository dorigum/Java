package ch15.sec02;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ArrayList 사용
// 4개의 단어를 입력받고,
// 가장 긴 단어와 길이를 출력하는 프로그램 작성

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();

		// 키보드로부터 4개의 단어를 입력 받아 ArrayList에 삽입
		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
		for (int i = 0; i < 4; i++) {
			System.out.println("단어를 입력하세요>>");
			String s = scanner.next(); // 키보드로부터 단어 입력
			a.add(s); // ArrayList 컬렉션에 삽입
		}

		System.out.println("-----------------------------------");

		// ArrayList에 들어 있는 모든 단어 출력
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i); // ArrayList i번째 문자열 얻어오기
			System.out.println(name + " ");
		}

		// 가장 긴 이름 출력
		// length() 메소드 사용
		int longestIndex = 0; // 현재 가장 긴 단어가 있는 ArrayList 내의 인덱스
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longestIndex).length() < a.get(i).length()) // 단어 길이 비교
				longestIndex = i; // i번째 단어가 더 긴 단어
		}

		System.out.println("\n가장 긴 단어는 : " + a.get(longestIndex));
		System.out.println("가장 긴 단어의 길이는 : " + a.get(longestIndex).length());
		scanner.close();

		/*
		for (int i=0; i<get.length; i++){
		System.out.println("가장 긴 단어는 : " + name);
		System.out.println("가장 긴 단어의 길이는 : " + @@@);
		}*/

	}

}
