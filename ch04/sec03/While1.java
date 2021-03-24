package ch04.sec03;

// while문
// 조건에 따라 반복을 계속할 지 결정할 때 사용
// 조건식이 true일 경우 계속해서 반복
// 주의 : 초기값과 증감식을 반드시 적는다!

public class While1 {

	public static void main(String[] args) {
		int i=1; // 초기값
		while(i<=10) { // 조건
			//반복 수행되는 문장
			System.out.println(i);
			
			//증감식
			i++;
			
		}

		// while문 종료 후 i값 출력
		System.out.println("i=" + i);
	}

}
