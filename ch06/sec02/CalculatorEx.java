package ch06.sec02;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		myCal.powerOn();
		
		// plus() �޼ҵ� ȣ��
		// �Ű����� ������ ������ 2�� ����
		// ������� �޾Ƽ�
		// ������ ������ ����
		// �޼ҵ带 ȣ���� ������� �޼ҵ� �̸��� ���� ��ġ�� ��ȯ
		
		int result1 = myCal.plus(5,6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCal.powerOff();
		
	}

}
