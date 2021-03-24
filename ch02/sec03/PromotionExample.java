package ch02.sec03;

// 자동 타입 변환 : 프로그램 실행 도중 자동적으로 타입 변환이 일어나는 것
// 작은 크기의 타입이 큰 크기의 타입에 저장될 때 발생

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("'가'의 유니코드 : " + intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);

	}

}
