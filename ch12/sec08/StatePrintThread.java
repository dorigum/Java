package ch12.sec08;

// TargetThread�� ���¸� ���������� ����ϴ� ������ �ϴ� Ŭ����
// 0.5�� �ֱ�� TargetThread�� ���¸� ��� ���� ���

public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		// ���� �ݺ��ϸ鼭 ������ ���� ���
		// TERMINATED ���°� �Ǹ� �ݺ��� ����
		while (true) {
			// (1) ������ ���� ���
			// ������ ���¸� ��Ÿ���� ���� ��� ���ڿ� ��ȯ
			Thread.State state = targetThread.getState();
			System.out.println("Ÿ�� ������ ���� : " + state);

			// (2) �����尡 ���� �����Ǿ����� start() �޼ҵ� ȣ��
			// (���� ��� ���� �Ǵ� ���� ���°� ��)

			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			// (3) ���°� TERMINATED�̸� �ݺ��� ����
			if (state == Thread.State.TERMINATED) {
				break;
			}

			// (4) 0.5�ʰ� ���� : �Ͻ� ���� ����
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }

		}
	}

}
