package ch03.sec04;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("����1 �Է� : ");
		num1 = sc.nextInt();
		
		System.out.print("����2 �Է� : ");
		num2 = sc.nextInt();
		
		System.out.println("���� : " + (num1 + num2));
		System.out.println("���� : " + (num1 - num2));
		System.out.println("���� : " + (num1 * num2));
		System.out.println("������ : " + (num1 / num2));
		System.out.println("������ : " + (num1 % num2));

		
		//float average = 88.333336f;
		
		//DecimalFormat df = new DecimalFormat("0.00");
		
		//System.out.println("��� : " + df.format(average));
		
		sc.close();

	}

}
