package ch04.sec03;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, sum=0;
		
		System.out.print("Start �Է� : ");
		start = sc.nextInt();
		
		System.out.print("End �Է� : ");
		end = sc.nextInt();
		
		for(int i=start; i<=end; i++)
			sum += i;
		
		System.out.print(start + "~" + end + "�� �� : " + sum);
		
		sc.close();
		
	}

}
