package ch07.sec04.pack2;

import ch07.sec04.pack1.AA;

// 다른 패키지

public class CC {
	AA a1 = new AA(true); // public 접근 가능
	//AA a2 = new AA(1);	  // default 접근 불가능
	// default : 동일 패키지 내에서만 접근 가능
	//AA a3 = new AA("문자열"); // private 접근 불가능
	// 클래스 외부에서 완전 사용 불가!!
	
}
