package ch06.sec03;

public class Reservation {
	String flight, name, departure, arrival, seatNo;
	int price;

	// �Ű������� �ִ� ������
	public Reservation(String fl, String na, String dpt, String arv, int p, String s) {
		flight = fl;
		name = na;
		departure = dpt;
		arrival = arv;
		price = p;
		seatNo = s;
	}
	
		public void showRsvInfo() {
			System.out.println("*****�װ��� ���� ����*****");
			System.out.println("�װ��� : " + flight);
			System.out.println("������ : " + name);
			System.out.println("����� : " + departure);
			System.out.println("������ : " + arrival);
			System.out.println("�ݾ� : " + price);
			System.out.println("�¼���ȣ : " + seatNo);
	}

}
