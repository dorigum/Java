package ch11.sec03;

public class SubStringEx {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		
		// substring(start, end) : start���� end-1���� ����
		String firstNum = ssn.substring(0, 6);	// �ε��� 5���� ����(6��°���� ����)
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	// �ε��� 7���� ������
		System.out.println(secondNum);
		
		// ����� 88�� 8�� 15�Ͽ� �¾�̱���.
		String year = ssn.substring(0, 2);
		String month = ssn.substring(2, 4);
		String date = ssn.substring(4, 6);
		
		System.out.println("����� " + year + "�� "
						  + month + "�� " + date + "�Ͽ� "
						  + "�¾�̱���.");
	}

}
