package ch12.sec04;

// 2�� ������ Ŭ���� ����
// ThreadA : ������ �̸� ����
// ThreadB : �̸��� �������� ����(Thread-n)���� ���

public class ThreadA extends Thread {
	
	// �����ڿ��� ������ �̸� ����
	public ThreadA() {
		setName("TheradA");
	}
	
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
