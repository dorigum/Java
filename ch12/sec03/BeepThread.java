package ch12.sec03;

import java.awt.Toolkit;

// ������ ���� ��� 2
// Thread Ŭ������ ��ӹ���
// Thread ���� Ŭ���� 
public class BeepThread extends Thread {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}

		}
	};
}
