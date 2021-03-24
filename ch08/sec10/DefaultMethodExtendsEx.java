package ch08.sec10;

public class DefaultMethodExtendsEx {

	public static void main(String[] args) {
		// 익명 구현 객체를 생성해서 인터페이스 변수에 대입
		ChildInterface1 ci1 = new ChildInterface1() {
			// 재정의
			@Override
			public void method1() {
				System.out.println("ChildInterface1에서 재정의된 method1() 실행");
				
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface1에서 재정의된 method3() 실행");
				
			}
			
			// 디폴트 메소드는 재정의하지 않았음
			
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		
		// ChildInterface2에서 재정의된 method1() 실행
		
		System.out.println("------------------------------------------------");
		
		// 익명 구현 객체를 생성해서 인터페이스 변수에 대입
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				System.out.println("ChildInterface2에서 재정의된 method1() 실행");
				
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2에서 재정의된 method3() 실행");
				
			}
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		
		
		
		System.out.println("------------------------------------------------");
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				System.out.println("ChildInterface3에서 재정의된 method1() 실행");	
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface3에서 재정의된 method2() 실행");
				
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2에서 재정의된 method3() 실행");
				
			}
			
		};
		
		ci3.method1();
		ci3.method2();
		ci3.method3();
		
	}
}
