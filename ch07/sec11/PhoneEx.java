package ch07.sec11;

public class PhoneEx {

	public static void main(String[] args) {
		// �߻� Ŭ������ ��ü�� ������ �� ����.
		//Phone phone = new Phone();

		// �׷��� �ڽ� Ŭ������ ��ü�� �����ؼ�
		// Phone Ŭ������ �޼ҵ带 ����� �� �ִ�.
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		
	}

}
