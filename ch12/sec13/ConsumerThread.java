package ch12.sec13;

// �Һ��� ������ : ������ �о (getData() �޼ҵ� ���)
public class ConsumerThread extends Thread {
	// ���� ��ü �ʵ�
	private DataBox dataBox;

	// �����ڿ��� �ʱ�ȭ
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		// �����͸� �о���� ��
		for (int i = 1; i <= 3; i++) {
			String data = dataBox.getData();

		}
	}
}
