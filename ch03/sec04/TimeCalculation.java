package ch03.sec04;

import java.util.Scanner;

public class TimeCalculation {

	public static void main(String[] args) {
		int time, seconds, minutes, hours;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�ð� �Է� (��) : ");
		time = s.nextInt();
		
		hours = time / 3600;
		minutes = time % 3600 / 60;
		seconds = time % 3600 % 60;
		//seconds = time % 60;
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hours + "�ð�, ");
		System.out.print(minutes + "��, ");
		System.out.print(seconds + "�� �Դϴ�. ");
		
		s.close();
		
	}

}
