package ch06.sec01;

public class CarEx {

	public static void main(String[] args) {
		// Car Ŭ������ ��ü ����
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		// �ν��Ͻ�(��ü) : �ʵ忡 �� ����
		// ��ü.�ʵ�
		//c1.carNo = "11�� 1234";
		// �޼ҵ带 ȣ�� : �ʵ� ���� ���
		// ��ü.�޼ҵ�()
		
		c1.setCarNo("11�� 1234");
		c1.showCarInfo();
		
		//c2.carNo = "22�� 5678";
		c2.setCarNo("22�� 5678");
		c2.showCarInfo();
		
		//c3.carNo = "33�� 1111";
		c3.setCarNo("33�� 1111");
		c3.showCarInfo();

	}

}
