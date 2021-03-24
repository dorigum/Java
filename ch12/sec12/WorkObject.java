package ch12.sec12;

// 공유 객체
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
	
		// 현재 waiting된 다른 스레드를 대기 상태로 변경
		notify();
		
		try {
			wait(); // 자기 자신은 일시 정지 상태로 변경
		} catch (InterruptedException e) {
		}
		
		
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		
		// 현재 waiting된 다른 스레드를 대기 상태로 변경
		notify();
		
		try {
			wait(); // 자기 자신은 일시 정지 상태로 변경
		} catch (InterruptedException e) {
		}
	}
	
}
