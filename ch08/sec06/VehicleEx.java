package ch08.sec06;

public class VehicleEx {

	public static void main(String[] args) {
		// �������̽� ������ Bus ��ü ����
		// Vehicle Ÿ������ �ڵ� Ÿ�� ��ȯ
		Vehicle vehicle = new Bus();
		
		// Vehicle Ÿ���̹Ƿ� Vehicle ����� ��� ����
		vehicle.run();
		// Vehicle Ÿ������ �ڵ� ��ȯ�Ǿ��� ������
		// Bus ��� ��� �Ұ�
		//vehicle.checkFare(); // (X)
		
		// Bus ����� ����Ϸ��� �ٽ� Ÿ���� ��ȯ�ؾ��Ѵ�. : ���� Ÿ�� ��ȯ
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		
	}

}
