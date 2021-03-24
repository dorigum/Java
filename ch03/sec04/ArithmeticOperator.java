package ch03.sec04;

//import java.text.DecimalFormat;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Á¤¼ö1 ÀÔ·Â : ");
		num1 = sc.nextInt();
		
		System.out.print("Á¤¼ö2 ÀÔ·Â : ");
		num2 = sc.nextInt();
		
		System.out.println("µ¡¼À : " + (num1 + num2));
		System.out.println("»¬¼À : " + (num1 - num2));
		System.out.println("°ö¼À : " + (num1 * num2));
		System.out.println("³ª´°¼À : " + (num1 / num2));
		System.out.println("³ª¸ÓÁö : " + (num1 % num2));

		
		//float average = 88.333336f;
		
		//DecimalFormat df = new DecimalFormat("0.00");
		
		//System.out.println("Æò±Õ : " + df.format(average));
		
		sc.close();

	}

}
