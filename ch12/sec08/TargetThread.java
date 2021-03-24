package ch12.sec08;

public class TargetThread extends Thread {
	@Override
	public void run() {
		// 10억번 반복
		// 실행 대기 상태 또는 실행 상태 (RUNNABLE)
		for (long i = 0; i < 1000000000; i++) {
		}

		// 일시 정지 상태
		try {
			Thread.sleep(1500); // 1.5초 정리
		} catch (InterruptedException e) {
		}

		// 10억번 반복
		// 실행 대기 상태 또는 실행 상태
		for (long i = 0; i < 1000000000; i++) {
		}

		// 반복문이 종료되면
		// 스레드 종료 상태 (TERMINATED)
	}
}
