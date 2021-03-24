package ch03.sec04;

// 3항 연산자
// 조건식 ? 조건식이 참일 때 : 조건식이 거짓일 때

public class ConditionalOperator {

	public static void main(String[] args) {
		int score = 75;
		char grade = (score > 90 ) ? 'A' : 'B';

		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다.");

	}

}
