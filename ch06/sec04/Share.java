package ch06.sec04;

// static 필드 공유
// static 필드 모든 객체가 공유

public class Share {
	int a; // 인스턴스 필드
	static int staticA; // static 필드
	
	// 인스턴스 메소드
	public void set(int n) {
		a += n;
		staticA += n;
		
	}
	
	// 인스턴스 메소드
	public int showA() {
		return a;
		
	}
	
	// static 메소드
	public static int showStaticA() {
		return staticA;
		
	}
	
}
