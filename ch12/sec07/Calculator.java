package ch12.sec07;

// ����ȭ �޼ҵ� : synchronized Ű���� ��� (lock(���)�� �ǹ�)
// �Ӱ� �������� �ѹ��� �� �����常 ���� ����
// �ٸ� ������� �޼ҵ� �Ǵ� ����� ������ ���� ������ ���

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	// ����ȭ �޼ҵ� : �޼ҵ� �̸� �տ� synchronized Ű���� ���
	public synchronized void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(2000); // 2�ʰ� ����
		} catch (InterruptedException e) { }
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}

}
