package ch12.sec04;

// 2개 스레드 클래스 생성
// ThreadA : 스레드 이름 설정
// ThreadB : 이름을 설정하지 않음(Thread-n)으로 출력

public class ThreadA extends Thread {
	
	// 생성자에서 스레드 이름 설정
	public ThreadA() {
		setName("TheradA");
	}
	
	@Override
	public void run() {
		for(int i = 0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
			// getName() : 스레드 이름 반환
			// Thread 클래스의 인스턴스 메소드
			// 상속받은 ThreadA에서 호출해서 사용 가능
			
		}
	}
}
