package ch03.sec04;

// 누적 대입 연산자
// 정해진 연산을 수행한 후, 결과를 변수에 저장
// a = a + 10 --> a += 10

public class AssignmentOperator {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println("result = " + result);
		
		result -= 5;
		System.out.println("result = " + result);

		result *= 3;
		System.out.println("result = " + result);
		
		result /= 5;
		System.out.println("result = " + result);

		result %= 3;
		System.out.println("result = " + result);


	}

}
