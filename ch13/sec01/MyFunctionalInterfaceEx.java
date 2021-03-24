package ch13.sec01;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		// 인터페이스 변수;
		MyFunctionalInterface fi;

		// 인터페이스 변수 = 람다식
		// 매개변수 없고, 리턴값도 없는 람다식
		// 매개변수가 없는 경우, 반드시 빈 괄호 () 있어야함

		fi = () -> {
			String str = "method call1"; // 실행 문장이 2개
			System.out.println(str);
		};

		// 메소드 호출 : 람다식의 중괄호 { ... } 실행
		fi.method();
		
		// 실행 문장이 1개인 경우 (괄호 생략 가능)
		fi = () -> { System.out.println("method call2");};
		fi.method();
		
		
		// 실행 문장이 1개이면 중괄호 {} 생략 가능
		fi = () -> System.out.println("method call3");
		fi.method();
		
		}


}
