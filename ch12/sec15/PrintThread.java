package ch12.sec15;

public class PrintThread extends Thread {
	@Override
	public void run() {
		// ���� �ݺ�
		try {
			while (true) {
				System.out.println("���� ��");
				// �Ͻ� ���� ���°� ������
				// interrupt() ȣ���ص� ���� ����
				Thread.sleep(1);	// �Ͻ� ���� �����̹Ƿ�
				// interrupt() ȣ�� �� ���� �߻�
			}
		} catch (InterruptedException e) {
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
