package ch02.sec03;

// 강제 타입 변환(강제 형변환)
// 큰 크기의 타입을 작은 크기의 타입으로 강제로 변환하는 것

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);

	}

}
