package ch12.sec14;

// ������ ���Ḧ ���� stop �÷��� �̿�
// stop �÷��׷� run() �޼ҵ��� ���� ���Ḧ ����
// run() �޼ҵ尡 ����Ǹ� ������ ����
// stop ���� true �Ǵ� false �������� Ȯ���ؼ� �����ϴ� ���

public class PrintThread extends Thread {
	private boolean stop;
	
	// �ܺο��� stop �� ���� ����
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	
	@Override
	public void run() {
		while(!stop) {	// ������ false�� while�� ���� (stop�� true�� ���)
			System.out.println("���� ��");
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}

}
