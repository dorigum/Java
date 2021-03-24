package ch12.sec03;

import java.awt.Toolkit;

// 스레드 생성 방법 2
// Thread 클래스를 상속받은
// Thread 하위 클래스 
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
