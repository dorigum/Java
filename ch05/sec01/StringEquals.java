package ch05.sec01;

// 문자열 비교 : equals() 메소드 사용
// 객체 참조 비교 : == 사용

public class StringEquals {

	public static void main(String[] args) {
		String strVal1 = "홍길동";
		String strVal2 = "홍길동";
		
		// 동일한 객체를 참조하는지 조사
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		} else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		
		// 문자열이 같은지 비교
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		
		
		
		
		String strVal3 = new String("홍길동");
		String strVal4 = new String("홍길동");
		
		
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 참조가 같음");
		} else {
			System.out.println("strVal1과 strVal2는 참조가 다름");
		}
		
		// 문자열이 같은지 비교
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 문자열이 같음");
		}
		
		
	}

}
