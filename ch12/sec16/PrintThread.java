package ch12.sec16;

public class PrintThread extends Thread {
	@Override
	public void run() {
		// ���� �ݺ�

		// ���1
		// Thread Ŭ������ ���� �޼ҵ� interrupted() ���
		/*		while (true) {
					System.out.println("���� ��");
					// �Ͻ� ���� ���� ���� ���
					// Interrupt�� ���������� Ȯ���ϰ�
					// Interrupt �Ǿ����� ����
					// Interrupted() �޼ҵ� �Ǵ� isInterrupted() �޼ҵ� ���
					// Thread.interrupted() : interrupted()�� Thread�� ���� �޼ҵ�
					if (Thread.interrupted()) { // Interrupt �Ǿ�����
						break; // while�� ����
					}
				}*/
		
		

		// ���2
		// isInterrupted() �޼ҵ� ���
		// Thread Ŭ������ �ν��Ͻ� �޼ҵ� isInterrupted() ���
		// PrintThread Thread Ŭ������ ��� �޾����Ƿ� Thread �ν��Ͻ� �޼ҵ� ��� ����
		while (true) {
			System.out.println("���� ��");

			if (isInterrupted()) { // interrupt �Ǿ�����
				break;

			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
