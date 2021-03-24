package ch02.sec02;
// 데이터 타입

public class DataType {

	public static void main(String[] args) {
		// 문자 타입 변수 선언 및 초기화
		char a = 'A';
		char b = '\u0041';
		char c = 65;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("----------------------------");
		
		// 정수 타입 변수 선언 및 초기화
		int byteValue = 10;					// 1바이트 정수
		int shortValue = 1000;				// 2바이트 정수
		int intValue = 2100100100;			// 4바이트 정수
		long longValue = 100010001000100L;	// 8바이트 정수
		
		System.out.println("byteValue : " + byteValue);
		System.out.println("shortValue : " + shortValue);
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : " + longValue);
		
		System.out.println("----------------------------");

		// 실수 타입 변수 선언 및 초기화
		double doubleValue = 0.1234567890123456789; // 8바이트 실수(더 정밀함)
		float floatValue = 0.1234567890123456789f;	// 4바이트 실수 : f 안붙이면 오류
		
		System.out.println("doubleValue : " + doubleValue);
		System.out.println("floatValue : " + floatValue);

		System.out.println("----------------------------");

		// 지수 표현 : e 사용하기
		int var1 = 3000000;		
		double var2 = 3e6;		// 0이 6개
		float var3 = 3e6f;		// float이므로 f 붙임
		double var4 = 2e-3;		// -3 : 소수점 이하 3자리
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);

		System.out.println("----------------------------");

		//논리 타입 변수 선언 및 초기화
		boolean booleanValue = true;
		System.out.println("booleanValue : " + booleanValue);
		
		System.out.println("----------------------------");

		// String 타입(문자열) 변수 선언 및 초기화
		String name = "홍길동";
		System.out.println("name : " + name);
		

	}

}
