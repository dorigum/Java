package ch12.sec04;

public class ThreadNameEx {

	public static void main(String[] args) {
		// ���� ���� ���� Ŭ���� Ȯ��
		Thread mainThread = Thread.currentThread();	// static �޼ҵ�
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());

		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();	// run() �޼ҵ� ȣ��
		
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		threadB.start();	// run() �޼ҵ� ȣ��
		
		
		ThreadC threadC = new ThreadC();
		System.out.println("�۾� ������ �̸� : " + threadC.getName());
		threadC.start();	// run() �޼ҵ� ȣ��
		
	}

}
