package ch06.sec02;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		myCal.powerOn();
		
		// plus() 메소드 호출
		// 매개변수 값으로 정수값 2개 전달
		// 결과값을 받아서
		// 정수형 변수에 저장
		// 메소드를 호출한 결과값은 메소드 이름이 적힌 위치로 반환
		
		int result1 = myCal.plus(5,6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCal.powerOff();
		
	}

}
