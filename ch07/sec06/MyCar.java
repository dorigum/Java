package ch07.sec06;

public class MyCar {
	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	// final �޼ҵ� : ������(�������̵�) �Ұ�
	public final void stop() {
		System.out.println("�ڵ� ����");
		speed = 0;
	}
}
