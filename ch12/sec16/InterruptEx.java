package ch12.sec16;

public class InterruptEx {

	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

			// interrupt() ȣ��
			thread.interrupt();
			
			
			// �� ���� ���Ḧ ������,,?
			// �ʸ� ���ᳪ
			
		}

	}

}
