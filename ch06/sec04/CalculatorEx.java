package ch06.sec04;

// static(����) ��� (�ʵ�� �޼ҵ�)
// Ŭ������ ������ �ʵ�� �޼ҵ�
// Ŭ������ �Ҽ�
// Ŭ���� �� �ϳ��� ���� ����
// ��� �ν��Ͻ� ��ü���� ���� ����
// ���α׷��� ���۵� �� �̹� ����(��ü���� ���� ����)
// ���α׷��� ����� �� �����
// Ŭ�����̸�.�ʵ�
// Ŭ�����̸�.�޼ҵ�()

public class CalculatorEx {
	public static void main(String[] args) {
		// static �ʵ� ��� : Ŭ�����̸�.�ʵ�
		double result1 = 10 * 10 * Calculator.pi;
		
		// static �޼ҵ� ȣ�� : Ŭ�����̸�.�޼ҵ�()
		int result2 = Calculator.plus(10, 50);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	
	}

}
