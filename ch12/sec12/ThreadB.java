package ch12.sec12;

public class ThreadB extends Thread {
	private WorkObject workObject;	// ���� ��ü

	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}
