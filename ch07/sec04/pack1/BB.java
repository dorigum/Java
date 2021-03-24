package ch07.sec04.pack1;

// AA 클래스와 동일 패키지

public class BB {
	AA a1 = new AA(true); // public 접근 가능
	AA a2 = new AA(1);	  // default 접근 가능
	//AA a3 new AA("문자열"); // private 접근 불가능
	// 동일 패키지라도 private 접근 불가
	
}
