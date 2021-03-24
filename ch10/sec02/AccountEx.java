package ch10.sec02;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000); // 호출한 곳에서 예외 처리
		} catch (BalanceInsufficientExecption e) {
			// 예외 발생 시킬 때, 생성자에게 전달한 메세지를 반환받아서 출력
			String message = e.getMessage();
			System.out.println(message);
			
			System.out.println();
			e.printStackTrace();
		}
	}
}
