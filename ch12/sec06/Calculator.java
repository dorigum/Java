package ch12.sec06;

// 2���� �����尡 Calculator ��ü�� ������ �� ����� ����
// User1�� ���� 100���� �����ϰ� 2�� ��� ���� �߿�
// User2�� ���� 50���� ������ ���
// User1�� ������ �� 100�� �ƴ� ����� �� 50�� ��µǴ� ����

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;

		try {
			Thread.sleep(2000); // 2�ʰ� ����
		} catch (InterruptedException e) { }
		
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		
	}

}
