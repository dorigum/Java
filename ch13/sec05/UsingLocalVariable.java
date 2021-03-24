package ch13.sec05;

// 람다식에서 메소드의 매개변수 또는 로컬변수는 final 특성을 가져야 한다.
// final 키워드 생략해도 final 특성 (Java 8부터)

public class UsingLocalVariable {
	// 매개변수를 갖는 메소드
	void method(int arg) { // 매개변수 arg는 final 특성을 가짐
		int localVar = 40; // 로컬 변수 localVar는 final 특성을 가짐
		//arg = 10;

		// 람다식
		MyFunctionalInterface fi = () -> {
			// 매개 변수 사용
			System.out.println("arg : " + arg);
			// 로컬 변수 사용
			System.out.println("localVar : " + localVar);
		};
		
		fi.method();
		
	}
}
