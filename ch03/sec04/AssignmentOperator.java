package ch03.sec04;

// ���� ���� ������
// ������ ������ ������ ��, ����� ������ ����
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
