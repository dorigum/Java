package ch03.sec04;

// �� ������
// &&, & (AND)
// ||, | (OR)
// ! (NOT)

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 49; // 65
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("�빮�� �̱���");
		}
	
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("�ҹ��� �̱���");
		}
		
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 ���� �̱���");
		}
		
		int value = 6;
		
		// "2 �Ǵ� 3�� ��� �̱���"
		// 2�� ��� : 2�� ���� �������� 0�� ��
		// 3�� ��� : 3���� ���� �������� 0�� ��
		
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ����̱���.");
			
		}
	}
}
