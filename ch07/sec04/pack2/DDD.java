package ch07.sec04.pack2;

import ch07.sec04.pack1.AAA;

// 다른 패키지
// 상속의 경우 protected 필드 접근 가능
// 상속을 받은 자식 클래스라도 private와 default는 접근 불가

public class DDD extends AAA {
	public DDD() {
		// 상속 받았으므로 부모의 필드와 메소드 사용 가능
		// 객체 생성하지 않고 접근
		field1 = 1;	// public (O)
		//field2 = 1;	// default (X)
		//field3 = 1;	// private (X)
		field4 = 1; // protected (O) : 상속의 경우, 접근 제한 없음
		
		// 메소드 접근
		method1();	// public (O)
		//method2();	// default (X)
		//method3();	// private (X)
		method4(); // protected (O) : 상속의 경우, 접근 제한 없음
		
	}

}
