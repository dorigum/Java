package ch12.sec04;

public class ThreadC extends Thread {
	// ������ �̸� �������� ����
	
	@Override
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName() + "�� ����� ����");
			// getName() : ������ �̸� ��ȯ
			// Thread Ŭ������ �ν��Ͻ� �޼ҵ�
			// ��ӹ��� ThreadA���� ȣ���ؼ� ��� ����
		}
	}
}