package ch05.sec02;

import java.util.Scanner;

// 입력 받아서 배열에 저장

public class Array4 {

	public static void main(String[] args) {
		// 크기가 5인 정수 배열에 숫자를 입력 받아서 저장
		// 숫자 입력
		// num[0] : ...7
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("숫자 입력");
		for(int i=0; i<num.length; i++) {
		System.out.print("num[" + i + "] : ");
		num[i] = sc.nextInt();
		
		}
		
		// 배열의 값 출력
		// num[0] : ...7
		System.out.println("입력된 값 출력");
		for(int i=0; i<num.length; i++) {
		System.out.println("num[" + i + "]" + num[i]);

		}
		
		// 이름 입력
		// 5명의 이름을 입력받아 출력
		// 크기가 5인 String 배열에 이름을 입력 받아서 저장하고 출력
		String[] name = new String[5];
		
		System.out.println("이름 입력");
		for(int i=0; i<name.length; i++) {
			System.out.print("name[" + i + "]");
			name[i] = sc.next();
		}
		
			System.out.println("입력된 값 출력");
			for(int i=0; i<name.length; i++) {
				System.out.println("name[" + i + "]" + name[i]);
			}
		
			
		}
	
}
