package ch05.sec02;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// 점수 입력 : 5개 입력
		// 총점과 평균 출력
		// score, total, average
		// 점수 입력
		// 학생1 : 95 ...
		// 총점 : ...
		// 평균 : ...

		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];
		int total = 0;
		float average;
		
		System.out.println("점수 입력");
		for(int i=0; i<score.length; i++) {
			System.out.print("학생" + (i+1) + ":");
			
			score[i] = sc.nextInt();
			total += score[i];
		
		}
		
		average = total/(float)score.length;
		System.out.println("\n총점:" + total);
		System.out.println("평균:" + average);
		
		sc.close();
	
	}

}
