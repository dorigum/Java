package ch11.sec04;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		// 정규식 정의 : 전화번호 형식
		// (02|010) 02 또는 010
		// \\ : 역슬래시(특수문자)
		// \d : 한 개의 숫자
		// {3,4} : 3에서 부터 4개까지
		// {4} : 정확히 4개

		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";

		// data가 정규식 regExp에 맞는지 확인
		boolean result = Pattern.matches(regExp, data);
		if (result) { // result == true
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

		System.out.println("---------------------");

		// 이메일 형식의 정규식 정의
		// \w : 한 개의 알파벳 또는 한 개의 숫자 [a-zA-Z_0-9]
		// \. : .
		// + : 한 개 이상
		// () : 그룹핑
		// ? : 0개 또는 한 개
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		// .com이 2개까지는 일치, 3개부터는 일치하지 X
		result = Pattern.matches(regExp, data);

		if (result) { // result == true
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}

	}

}
