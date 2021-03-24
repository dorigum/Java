package ch02.sec03;

// 연산식에서 자동 타입 변환
public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; // 컴파일 오류
		// 정수 연산일 경우 : int 타입이 기본(4 byte)
		// 4바이트보다 작은 타입 (byte, char, short)은
		// int타입으로 변환된 후 연산 수행
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		// char타입 + char타입 : int타입
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; // 컴파일 오류
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 : " + intValue2);
		System.out.println("출력문자 : " + (char)intValue2);

	}

}
