package ch08.sec07;

public class Driver {
	public void drive(Vehicle vehicle) {
		// vehicle �Ű������� �����ϴ� ��ü�� Bus ��ü���� �����ؼ�
		// Bus ��ü�� ���, �����ϰ� ���� Ÿ�� ��ȯ ����
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
		
	}

}
