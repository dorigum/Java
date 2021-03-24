package ch12.sec16;

public class InterruptEx {

	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

			// interrupt() 호출
			thread.interrupt();
			
			
			// 왜 실행 종료를 안하지,,?
			// 초를 안줬나
			
		}

	}

}
