package ch11.sec03;

import java.util.StringTokenizer;

// 문자열 분리 방법
//(2) java.util.StringTokenizer 클래스 사용

public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "홍길동/이몽룡/성춘향";

		// 방법1 : 전체 토큰 수를 얻어서 for문으로 반복
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}

		
		System.out.println("--------------------");

		
		// 방법2 : 남아있는 토큰을 확인하고, 있으면 계속 반복 수행(while문 사용)
		st = new StringTokenizer(text, "/");
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
}