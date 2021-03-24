package ch12.sec02;

// ���� ������ : ������ ���

public class BeepPrintEx {

	public static void main(String[] args) {
		// ������ ���� ��� 1
		// Thread Ŭ�����κ��� ���� ����
		// Runnable ���� ��ü ���� ���1
		Runnable beepTask = new BeepTask();		// Runnable ���� ��ü
		Thread thread = new Thread(beepTask);	// �۾� ������ ����
		
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			
			try {
			Thread.sleep(500);
		} catch (InterruptedException e) {}
		
		
		}
		
		// Runnable ���� ��ü ���� ���2
		// �͸� ���� ��ü ��� (BeepTask ��� ����)
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
				
				}
			}
		});*/
		
		

		
		// Runnable ���� ��ü ���� ���3
		// ���ٽ� ���
		/*Thread thread = new Thread(() -> {
			Tookik tookit = Tookit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500); // 0.5�� ����
				} catch (InterruptedException e) {}
			}
		});
		
		// BeepTask�� run() �޼ҵ� ����
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			
			try {
			Thread.sleep(500);
		} catch (InterruptedException e) {}
		
		
		}*/
	}
}
