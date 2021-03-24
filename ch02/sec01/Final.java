package ch02.sec01;


// 상수 : 정해진 값을 가지며, 프로그램 실행 중에 값이 변하지 않음
// final 키워드 사용
// 관례적으로 대문자로 선언

public class Final {

	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius * radius * PI;
		
		System.out.println("원의 면적 : " + circleArea);
	
	}

	// System.out.println(); sys
	
}
