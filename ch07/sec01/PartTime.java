package ch07.sec01;

public class PartTime extends Worker {
	private int hours;
	private int unitPrice;
	
	public PartTime(String joominNo, String name, int hour, int unitPrice) {
		super(joominNo, name);
		this.hours = hours;
		this.unitPrice = unitPrice;
	}
	
	public int calculatePay() {
		return hours * unitPrice;
	}

	@Override
	public String toString() {
		return "\n�ñ� : " + unitPrice + " ��" +
				"\n�ٹ��ð� : " + hours + " �ð�" +
				"\n�� ���Ҿ� : " + calculatePay() + " ��" ;
	}
	
	

}
