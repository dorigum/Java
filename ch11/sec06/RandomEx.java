package ch11.sec06;

import java.util.Random;

// seed : ���� ��
// ������ ����� �˰��� ���Ǵ� ��
// ���� ���� ������ ������ ���� �߻�

public class RandomEx {

	public static void main(String[] args) {
		// Random() : seed ���� ���� ���
		// ���� �ð��� �ʱ� ������ �ؼ� ���� �߻�
		// ������ ������ �ٸ� ���� �߻�
		//Random random = new Random();

		// Random(seed) : seed ���� �ִ� ���
		// seed ���� �ʱ� ������ �ؼ� ���� �߻�
		// �Ź� ������ ������ ������ ���� �߻�
		Random random = new Random(3);
		
		for (int i = 0; i < 5; i++) {
			// 1~10 ����
			System.out.println(random.nextInt(10) + 1);
		}

	}

}