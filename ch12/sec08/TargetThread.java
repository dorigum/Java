package ch12.sec08;

public class TargetThread extends Thread {
	@Override
	public void run() {
		// 10��� �ݺ�
		// ���� ��� ���� �Ǵ� ���� ���� (RUNNABLE)
		for (long i = 0; i < 1000000000; i++) {
		}

		// �Ͻ� ���� ����
		try {
			Thread.sleep(1500); // 1.5�� ����
		} catch (InterruptedException e) {
		}

		// 10��� �ݺ�
		// ���� ��� ���� �Ǵ� ���� ����
		for (long i = 0; i < 1000000000; i++) {
		}

		// �ݺ����� ����Ǹ�
		// ������ ���� ���� (TERMINATED)
	}
}
