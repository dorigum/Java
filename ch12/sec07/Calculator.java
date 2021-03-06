package ch12.sec07;

// 동기화 메소드 : synchronized 키워드 사용 (lock(잠금)의 의미)
// 임계 영역으로 한번에 한 스레드만 실행 가능
// 다른 스레드는 메소드 또는 블록의 실행이 끝날 때까지 대기

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// 동기화 메소드 : 메소드 이름 앞에 synchronized 키워드 사용
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(2000); // 2초간 멈춤
		} catch (InterruptedException e) { }
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}

}
