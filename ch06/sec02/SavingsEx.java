package ch06.sec02;

public class SavingsEx {

	public static void main(String[] args) {
		Savings sav = new Savings();
		
		sav.setName();
		sav.setBalance();
		System.out.println("������ : " + sav.getName());
		System.out.println("�Ա� �� �ܾ� : " + sav.getBalance());
		sav.inputDeposit();
		System.out.println("���� : " + sav.getInterest());
		System.out.println("�����ܾ� : " + sav.getBalance());
	}

}
