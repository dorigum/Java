package ch10.sec02;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		// �����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		
		// ����ϱ�
		try {
			account.withdraw(30000); // ȣ���� ������ ���� ó��
		} catch (BalanceInsufficientExecption e) {
			// ���� �߻� ��ų ��, �����ڿ��� ������ �޼����� ��ȯ�޾Ƽ� ���
			String message = e.getMessage();
			System.out.println(message);
			
			System.out.println();
			e.printStackTrace();
		}
	}
}
