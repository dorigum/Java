package ch06.sec03;

// 디폴트 생성자

public class Constructor {
	int x;
	int y;
	
	// 생성자
	// 클래스 이름과 동일하고 반환형 없음
	// 객체 생성될 때 자동으로 호출
	// 역할 : 필드 값 초기화
	
	public Constructor() {
		x = 10;
		System.out.println(x);
		
	}
}
