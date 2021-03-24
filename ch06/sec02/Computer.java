package ch06.sec02;

public class Computer {
	// 메소드
	// 반환형 : int
	// 매개 변수 배열을 전달 받음
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
		
	}
	
	// 매개변수로 값의 리스트 전달 받음
	// ... : 전달된 개수에 따라 자동으로 배열을 생성
	// 배열 이름은 적혀있는 values
	// 값을 2개 전달하면 원소가 2개인 배열을 생성
	// 값을 3개 전달하면 원소가 3개인 배열을 생성
	
	public int sum2(int ...values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
		
	}
}
