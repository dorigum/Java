package ch04.sec03;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, score, sum=0;
		int i=1;
		float average;
		
		System.out.print("학생 수 입력 : ");
		num = sc.nextInt();
		
		while(i <= num) {
		System.out.print("학생" + i + " 점수 입력 : ");
		score = sc.nextInt();
		sum+=score;
		i++;
		
		}
		
		average=sum/(float)num;
		
		System.out.println("평균 : " + average);
		
		sc.close();
		
	}

}
