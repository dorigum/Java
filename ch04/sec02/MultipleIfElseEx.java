package ch04.sec02;

import java.util.Scanner;

public class MultipleIfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max;
		
		System.out.print("����1 �Է� : ");
		num1 = sc.nextInt();
		
		System.out.print("����2 �Է� : ");
		num2 = sc.nextInt();
		
		System.out.print("����3 �Է� : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
			max = num1;
		else if (num2 > num3)
			max = num2;
		else
			max = num3;
		
		System.out.print("���� ū �� : " + max);
		
		sc.close();

	}

}
