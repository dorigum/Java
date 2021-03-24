package ch07.sec04.pack1;

// 생성자의 접근 제한
// 생성자 오버로딩 : 이름 다르게 여러 개 생성(매개변수 다름)

public class AA {
	
	// AA 클래스 내에서
	// AA 클래스 타입의 객체 생성
	// 접근 제한자 상관없이 모든 생성자 접근 가능
	
	AA a1 = new AA(true); // 사용 가능
	AA a2 = new AA(1); // 사용 가능
	AA a3 = new AA("문자열"); // 사용 가능
	
	public AA(boolean b) {} // public
	AA(int b){} // default
	private AA(String s) {} // private
	
}
