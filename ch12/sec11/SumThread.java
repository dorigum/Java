package ch12.sec11;

// p606
// join() �޼ҵ� : �ٸ� �������� ���Ḧ ��ٸ�
// ���� ���� �����带 �Ͻ����� �ߴٰ�
// join()���� ȣ���� �����尡 �����ϸ�
// �ٽ� ���� ��� ���·� ����
// ��� �۾��� �ϴ� �����尡 ��� ��� �۾��� ��ĥ ������ ��ٸ��� �ִٰ�
// ��� �۾��� �� ��ġ�� ����� �޾Ƽ� �̿��ϴ� ���

// ��� �۾��� ����ϴ� ������

public class SumThread extends Thread {
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <=100; i++) {
			sum += i;
		}
	}
}
