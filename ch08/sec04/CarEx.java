package ch08.sec04;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		// �ʵ��� ������
		// �迭�� �ε��� ���
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
		
	}

}
