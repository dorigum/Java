package ch03.sec04;

import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		int time, seconds, minutes, hours;
		Scanner s = new Scanner(System.in);
		
		System.out.print("시간 입력 (초) : ");
		time = s.nextInt();
		
		hours = time / 3600;
		minutes = time % 3600 / 60;
		seconds = time % 3600 % 60;
		//seconds = time % 60;
		
		System.out.print(time + "초는 ");
		System.out.print(hours + "시간, ");
		System.out.print(minutes + "분, ");
		System.out.print(seconds + "초 입니다. ");
		
		s.close();
		
	}

}
