package ch04.sec03;

import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, score, sum=0;
		float average;
		
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();
		
		for(int i=1; i <= num; i++) {
		System.out.print("학생" + i + " 점수 입력 : ");
		score = sc.nextInt();
		sum+=score;
		}
		
		average=sum/(float)num;
		
		System.out.println("평균 : " + average);
		
		sc.close();
		
	}

}
