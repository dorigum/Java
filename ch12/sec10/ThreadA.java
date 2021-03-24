package ch12.sec10;

// yield() : �ٸ� �����忡�� ���� �纸
// yield()�� ȣ��Ǹ� ���� ������� ��� ���·� ����ǰ�
// �켱 ������ ���ų� ������ �����尡 ����

public class ThreadA extends Thread {
	// ���� ���¿� �۾� ���� ���¸� �˱� ���� �ʵ� �ʱ�ȭ
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {	// ������ true�� �ݺ��� ���
			if(work) {	// �۾� ���� true��
				System.out.println("ThreadA �۾� ����");
			} else {
				Thread.yield();
				// ThreadA�� ��� ���·� ����
				// ThreadA�� �켱 ������
				// �����ϰų� ���� ������ ����
				
			}
		}
		
		System.out.println("ThreadA ����");
	}
}
