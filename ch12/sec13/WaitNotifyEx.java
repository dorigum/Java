package ch12.sec13;

public class WaitNotifyEx {

	public static void main(String[] args) {
		// ���� ��ü ����
		DataBox dataBox = new DataBox();
		
		// ������ ������ ����
		ProducerThread producerThread = new ProducerThread(dataBox);
		// �Һ��� ������ ����
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();

	}

}
