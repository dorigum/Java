package ch03.sec04;

// 3�� ������
// ���ǽ� ? ���ǽ��� ���� �� : ���ǽ��� ������ ��

public class ConditionalOperator {

	public static void main(String[] args) {
		int score = 75;
		char grade = (score > 90 ) ? 'A' : 'B';

		System.out.println(score + "���� " + grade + "����Դϴ�.");
		
		grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "���� " + grade + "����Դϴ�.");

	}

}
