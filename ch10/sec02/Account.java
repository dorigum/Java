package ch10.sec02;

public class Account {
	public long balance;
	
	public Account() { }

	public long getBalance() {
		return balance;
	
	}

	// ����
	public void deposit(int money) {
		balance += money;
	}
	
	// ���
	// ���� �߻� �ڵ带 ������ �ִ� �޼ҵ�
	// �ڽ��� ȣ���� ������ ���ܸ� ó���ϵ��� throws Ű����� ���ܸ� ���ѱ�
	public void withdraw(int money) throws BalanceInsufficientExecption {
		if(balance < money) {	// �ܰ� �����ϸ� ���� �߻�
			// ���� �޼����� �����ڿ��� ����
			throw new BalanceInsufficientExecption("�ܰ� ���� : " + (money-balance) + " ���ڶ�");
		}
	}
	
}
