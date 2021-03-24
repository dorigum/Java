package ch06.sec02;

public class SavingsEx {

	public static void main(String[] args) {
		Savings sav = new Savings();
		
		sav.setName();
		sav.setBalance();
		System.out.println("예금주 : " + sav.getName());
		System.out.println("입금 전 잔액 : " + sav.getBalance());
		sav.inputDeposit();
		System.out.println("이자 : " + sav.getInterest());
		System.out.println("최종잔액 : " + sav.getBalance());
	}

}
