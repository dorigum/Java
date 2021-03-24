package ch07.sec05;

public class Computer extends Calculator {

	// 재정의 : 내용 수정
	// 좀 더 정밀한 계산을 위해서
	// 부모 메소드에서 사용한 3.14159가 아닌 Math.Pi 상수 이용
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 클래스의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
	
}
