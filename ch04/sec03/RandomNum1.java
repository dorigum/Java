package ch04.sec03;

// 랜덤 숫자 생성
// (1) Math.random() 사용
// (2) Random 클래스 사용

public class RandomNum1 {

	public static void main(String[] args) {
		// (1) Math.random() 사용
		for (int i = 1; i <= 10; i++) {
			// 1. 0 < 랜덤 숫자 < 1
			// double num = Math.random();

			// 2. 정수 부분 값 존재
			// double num = Math.random()*10;

			// 3. 0부터 시작해서 10개의 정수 : 0~9 숫자 출력
			//int num = (int)(Math.random() * 10);
			
			// 4. 1~10 사이의 정수 출력
			int num = (int)(Math.random() * 10) + 1;
			
			System.out.println(num);

		}

	}

}
