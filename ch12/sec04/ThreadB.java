package ch12.sec04;

public class ThreadB extends Thread {
	// 스레드 이름 지정하지 않음
	
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