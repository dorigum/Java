package ch07.sec05;

public class Computer extends Calculator {

	// ������ : ���� ����
	// �� �� ������ ����� ���ؼ�
	// �θ� �޼ҵ忡�� ����� 3.14159�� �ƴ� Math.Pi ��� �̿�
	@Override
	double areaCircle(double r) {
		System.out.println("Computer Ŭ������ areaCircle() ����");
		return Math.PI * r * r;
	}
	
	
}
