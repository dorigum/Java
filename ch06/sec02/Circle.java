package ch06.sec02;

// 매개변수와 반환형이 있는 메소드

public class Circle {
	// 필드
	// 반지름 값을 저장할 필드 : radius
	int radius;
	
	// 메소드
	// setCircle()
	// 반지름 값을 전달 받아서
	// 필드 radius 값 설정
	public void setCircle(int r) {
		radius = r;
	}
	
	// area()
	// 원의 넓이를 계산해서 반환
	public float area() {
		float result = radius * radius * 3.14f;
		return result;
		
		// = return radius * radius * 3.14f;
	}
	
}
