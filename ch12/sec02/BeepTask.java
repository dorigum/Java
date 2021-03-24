package ch12.sec02;

import java.awt.Toolkit;

// BeepTask : 작업 스레드 : 비프음 출력
// main() : 메인 스레드 : 프린팅 담당

public class BeepTask implements Runnable {

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

}
