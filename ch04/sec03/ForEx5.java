package ch04.sec03;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, score, sum=0;
		float average;
		
		System.out.print("�л� �� �Է� : ");
		num = sc.nextInt();
		
		for(int i=1; i <= num; i++) {
		System.out.print("�л�" + i + " ���� �Է� : ");
		score = sc.nextInt();
		sum+=score;
		}
		
		average=sum/(float)num;
		
		System.out.println("��� : " + average);
		
		sc.close();
		
	}

}
