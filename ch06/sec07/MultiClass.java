package ch06.sec07;

import java.util.Scanner;

// 하나의 java 파일에 여러 클래스 작성

class Add {
	private int a, b;
	
	// 생성자 : 필드 값 초기화
	public Add(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 메소드
	public void calculate() {
		System.out.println("더하기 : " + (a+b));
	}
	
}


class Substract {
	private int a, b;
	
	// 생성자 : 필드 값 초기화
	public Substract(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 메소드
	public void calculate() {
		System.out.println("빼기 : " + (a-b));
	}
	
}


class Mutiply {
	private int a, b;
	
	// 생성자 : 필드 값 초기화
	public Mutiply(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 메소드
	public void calculate() {
		System.out.println("곱하기 : " + (a*b));
	}
	
}


class Divide {
	private int a, b;
	
	// 생성자 : 필드 값 초기화
	public Divide(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// 메소드
	public void calculate() {
		System.out.println("나누기 : " + (a/b));
	}
	
}







public class MultiClass {

	public static void main(String[] args) {
		// 연산할 숫자와 연산자를 입력 받아서 연산 결과를 출력
		// switch 문을 사용해서 연산자에 해당하는 클래스의 객체 생성해서 메소드 사용
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int a, b;
		char operator;
		
		// 숫자
		// 정수1 입력
		// 정수2 입력
		System.out.print("숫자1 입력 : ");
		a = sc.nextInt();
		
		System.out.print("숫자2 입력 : ");
		b = sc.nextInt();
		
		// 연산자 입력
		System.out.println("연산자 입력 (+,-,*,/) : ");
		operator = sc.next().charAt(0); // 연산자 한 문자 입력
		
		// switch문 사용
		// 연산자에 해당하는 클래스의 객체를 생성해서 메소드 호출
		// 결과값 출력
		switch(operator) {
			case '+' :
			Add add = new Add(a, b);
			add.calculate();
			break;
		
			case'-' :
			Substract sub = new Substract(a, b);
			sub.calculate();
			break;
			
			case '*' :
			Mutiply mul = new Mutiply(a, b);
			mul.calculate();
			break;
			
			case '/' :
			Divide div = new Divide(a, b);
			div.calculate();
			break;
			default:
				System.out.println("잘못된 연산입니다.");
		}
		
		sc.close();
	
	}
		
}
