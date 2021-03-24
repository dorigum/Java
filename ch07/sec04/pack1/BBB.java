package ch07.sec04.pack1;

// AA와 동일 패키지
// 동일 패키지 내에서는
// private 필드와 메소드를 제외하면
// 다른 모든 필드와 메소드 접근 가능

public class BBB {
	public BBB() {
		AAA a = new AAA();
		// 필드 접근
		a.field1 = 1;		// public (O)
		a.field2 = 1;		// default (O)
		//a.field3 = 1;		// private (X) : not visible
		// private은 외부에서 존재조차 모른다.
		a.field4 = 1;		// protected (O)
		// 동일 패키지에서 protected 접근 가능
		
		// 메소드 접근
		a.method1();	// public (O)
		a.method2();	// default (O)
		//a.method3();	// private (X) : not visible
		a.method4();	// protected (O)
		
	}

}
