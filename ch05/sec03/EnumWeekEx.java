package ch05.sec03;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// 열거 타입 변수 선언
		Week today = null;

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일

		// 열거 타입 변수 today에 열거 상수 대입
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

		System.out.println("오늘 요일 : " + today);

		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");

		}
		// Calendar 클래스 사용 현재 시간 출력
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);

		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);

		System.out.print("지금은" + year + "년" + month + "월" + day + "일");
		System.out.println(hour + "시" + minute + "분" + second + "초 입니다.");

	}
}
