package ch13.sec03;

// 리턴값이 있는 람다식
// 매개값 2, 5를 전달하고
// 2+5한 결과를 리턴하는 람다식 작성
// 결과 받아서 출력

public class MyfunctionalInterfaceEx {

	public static void main(String[] args) {
		MyfunctionalInterface fi;

		// 리턴값이 있는 람다식 : 매개변수 2개
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		// 메소드 호출 : 리턴값 있음
		// 리턴 값을 변수로 받거나
		int result = fi.method(2, 5);
		System.out.println(result);

		// 바로 출력
		System.out.println(fi.method(2, 5));

		// return문만 있는 경우
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		// return문만 있는 경우 중괄호 {} 생략 가능, return 문장 생략 가능
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		// 다른 메소드 호출하는 경우
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(3, 5));
	
	}
	
	public static int sum(int x, int y) {
		return (x + y);
		
	}
	
}
