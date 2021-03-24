package ch13.sec06;

public class RunnableEx {

	public static void main(String[] args) {
		// �����尡 �����ϴ� �ڵ带 ���ٽ����� ǥ��
		/*Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();*/

		
		// Thread ������ ȣ�� �� ���ٽ��� �Ű������� ����
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});

		thread.start();

	}

}
