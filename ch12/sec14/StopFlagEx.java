package ch12.sec14;

public class StopFlagEx {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		// 1�� ���� ��
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {	}
		
		printThread.setStop(true);
		// stop�� true�� ����
		// while(!true) -> false -> while�� ����
	}

}
