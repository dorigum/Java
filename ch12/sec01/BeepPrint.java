package ch12.sec01;

import java.awt.Toolkit;

// ���� �����常 ����
// �� �۾��� ������� �ϳ��� ����

public class BeepPrint {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// ������ 5�� ���� ���
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}
		
		// �� �ټ��� ���� ���
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) { }
		}
	}

}
