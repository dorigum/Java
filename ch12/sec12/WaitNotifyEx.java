package ch12.sec12;

public class WaitNotifyEx {

	public static void main(String[] args) {
		// ���� ��ü ����
		WorkObject sharedObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);

		threadA.start();
		threadB.start();
		
	}

}
