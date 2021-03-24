package ch10.sec01;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		// 정수 2개 입력 받고
		// 나누기 연산 : 0으로 나누면 오류
		// 예외 처리 문장 : "0으로 나눌 수 없습니다."
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("숫자 1 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 2 입력 : ");
		n2 = sc.nextInt();
		
		
		try {
			System.out.print("나누기 결과 : " + n1 / n2);
		} catch (ArithmeticException e) {
			System.out.print("0으로 나눌 수 없습니다.");
		}
		sc.close();
	}

}
