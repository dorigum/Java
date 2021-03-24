package ch10.sec02;

public class Account {
	public long balance;
	
	public Account() { }

	public long getBalance() {
		return balance;
	
	}

	// 예금
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금
	// 예외 발생 코드를 가지고 있는 메소드
	// 자신을 호출한 곳에서 예외를 처리하도록 throws 키워드로 예외를 떠넘김
	public void withdraw(int money) throws BalanceInsufficientExecption {
		if(balance < money) {	// 잔고가 부족하면 예외 발생
			// 예외 메세지를 생성자에게 전달
			throw new BalanceInsufficientExecption("잔고 부족 : " + (money-balance) + " 모자람");
		}
	}
	
}
