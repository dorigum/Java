package ch06.sec01;

public class Car {
	// Ŭ������ ��� �ʵ� = ������
	private String carNo;
	private String carName;
	private String carMaker;
	private String carYear;
	private String carCC;
	
	public void setCarNo(String no) {
		carNo = no;
	}
	
	// Ŭ������ ��� �޼ҵ� : �۾� ó��(���)
	public void showCarInfo() {
		System.out.println("���� ��ȣ : " + carNo);
	}
}
