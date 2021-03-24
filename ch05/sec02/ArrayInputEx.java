package ch05.sec02;

import java.util.Scanner;

public class ArrayInputEx {

	public static void main(String[] args) {
		// 정수 5개를 입력 받아서 최대값을 구하는 프로그램
		// 숫자 입력
		// num[0] : ...
		// 입력된 값 : ...
		// 최대값 : ...
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int max = 0; // 최대값 저장
		
		System.out.println("숫자 입력");
		
		for(int i=0; i<num.length; i++) {
			System.out.print("num[" + i + "]:");	
			num[i] = sc.nextInt();
			
			if(num[i] > max) // 입력된 값이 max보다 크면
				max = num[i];
		}
		
		System.out.print("\n입력된 값 : ");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + " ");
		}
		
		System.out.println("\n최대값 : " + max);
		
		sc.close();
		
	}

}
