package ch06.sec04;

// static(정적) 멤버 (필드와 메소드)
// 클래스에 고정된 필드와 메소드
// 클래스에 소속
// 클래스 당 하나만 생성 가능
// 모든 인스턴스 객체에서 공유 가능
// 프로그램이 시작될 때 이미 생성(객체보다 먼저 생성)
// 프로그램이 종료될 때 사라짐
// 클래스이름.필드
// 클래스이름.메소드()

public class CalculatorEx {
	public static void main(String[] args) {
		// static 필드 사용 : 클래스이름.필드
		double result1 = 10 * 10 * Calculator.pi;
		
		// static 메소드 호출 : 클래스이름.메소드()
		int result2 = Calculator.plus(10, 50);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	
	}

}
