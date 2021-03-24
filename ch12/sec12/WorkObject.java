package ch12.sec12;

// ���� ��ü
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
	
		// ���� waiting�� �ٸ� �����带 ��� ���·� ����
		notify();
		
		try {
			wait(); // �ڱ� �ڽ��� �Ͻ� ���� ���·� ����
		} catch (InterruptedException e) {
		}
		
		
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		
		// ���� waiting�� �ٸ� �����带 ��� ���·� ����
		notify();
		
		try {
			wait(); // �ڱ� �ڽ��� �Ͻ� ���� ���·� ����
		} catch (InterruptedException e) {
		}
	}
	
}
