package ch05.sec03;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// ���� Ÿ�� ���� ����
		Week today = null;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // ����

		// ���� Ÿ�� ���� today�� ���� ��� ����
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNSDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;

		}

		System.out.println("���� ���� : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");

		}
		// Calendar Ŭ���� ��� ���� �ð� ���
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.print("������" + year + "��" + month + "��" + day + "��");
		System.out.println(hour + "��" + minute + "��" + second + "�� �Դϴ�.");

	}
}
