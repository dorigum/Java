package ch04.sec03;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, score, sum=0;
		int i=1;
		float average;
		
		System.out.print("�л� �� �Է� : ");
		num = sc.nextInt();
		
		while(i <= num) {
		System.out.print("�л�" + i + " ���� �Է� : ");
		score = sc.nextInt();
		sum+=score;
		i++;
		
		}
		
		average=sum/(float)num;
		
		System.out.println("��� : " + average);
		
		sc.close();
		
	}

}
