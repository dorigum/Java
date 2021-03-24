package ch03.sec04;

// 논리 연산자
// &&, & (AND)
// ||, | (OR)
// ! (NOT)

public class LogicalOperator {

	public static void main(String[] args) {
		int charCode = 49; // 65
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 이군요");
		}
	
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요");
		}
		
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		
		// "2 또는 3의 배수 이군요"
		// 2의 배수 : 2로 나눈 나머지가 0인 수
		// 3의 배수 : 3으로 나눈 나머지가 0인 수
		
		if((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요.");
			
		}
	}
}
