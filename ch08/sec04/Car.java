package ch08.sec04;

public class Car {
	// �������̽� ������ ��ü ���� ����
	// �������̽� Ÿ������ �ڵ� Ÿ�� ��ȯ �߻�
	// �迭�� ����
	Tire[] tires = {new HankookTire(),
					new HankookTire(),
					new HankookTire(),
					new HankookTire()};
	
	public void run() {
		// �������̽��� ����� roll() �޼ҵ� ȣ��
		// HankookTire�� �����ǵ� roll() �޼ҵ� ȣ��
		// ���� ��ü���� ����
		// �迭�� for�� ���
		
		for(Tire tire : tires) {
			tire.roll();
			
		}
	}
}
