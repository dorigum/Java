package ch12.sec10;

// yield() : 다른 스레드에게 실행 양보
// yield()가 호출되면 현재 스레드는 대기 상태로 변경되고
// 우선 순위가 높거나 동일한 스레드가 실행

public class ThreadA extends Thread {
	// 중지 상태와 작업 중인 상태를 알기 위한 필드 초기화
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {	// 조건이 true면 반복문 계속
			if(work) {	// 작업 중이 true면
				System.out.println("ThreadA 작업 내용");
			} else {
				Thread.yield();
				// ThreadA를 대기 상태로 변경
				// ThreadA와 우선 순위가
				// 동일하거나 높은 스레드 실행
				
			}
		}
		
		System.out.println("ThreadA 종료");
	}
}
