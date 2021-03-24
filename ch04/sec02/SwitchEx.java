package ch04.sec02;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.print("점수 입력(0~100) : ");
		score = sc.nextInt();
		
		switch(score / 10) {
		
		case 10:	
		case 9: grade='A'; break;
		case 8: grade='A'; break;
		case 7: grade='A'; break;
		case 6: grade='A'; break;
		
		default:
			System.out.println("F");
		
			}
		
		}

}
