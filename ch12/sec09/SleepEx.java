package ch12.sec09;

import java.awt.Toolkit;

// main �����尡 ���� ���¿��� for�� ����
// 1�ʰ� �Ͻ����� ���·� ���ٰ� ->
// ���� ��� ���·� ���� ->
// ���� ����

// 1�� �������� �������� beep ���


public class SleepEx {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			System.out.println("beep");
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
