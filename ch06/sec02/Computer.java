package ch06.sec02;

public class Computer {
	// �޼ҵ�
	// ��ȯ�� : int
	// �Ű� ���� �迭�� ���� ����
	public int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
		
	}
	
	// �Ű������� ���� ����Ʈ ���� ����
	// ... : ���޵� ������ ���� �ڵ����� �迭�� ����
	// �迭 �̸��� �����ִ� values
	// ���� 2�� �����ϸ� ���Ұ� 2���� �迭�� ����
	// ���� 3�� �����ϸ� ���Ұ� 3���� �迭�� ����
	
	public int sum2(int ...values) {
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		
		return sum;
		
	}
}
