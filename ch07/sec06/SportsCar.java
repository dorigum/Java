package ch07.sec06;

public class SportsCar extends MyCar {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final �޼ҵ�� �������̵�(������) �� �� ����.
	/*@Override
	public void stop() {
		System.out.println("������ī ����");
		speed = 0;*/
	}