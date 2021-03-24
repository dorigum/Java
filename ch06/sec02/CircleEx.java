package ch06.sec02;

import java.util.Scanner;

public class CircleEx {

	public static void main(String[] args) {
		// Circle 클래스 객체 생성
		Circle c = new Circle();
		
		// 반지름 값을 입력 받음
		Scanner sc = new Scanner(System.in);
		int radius;
		
		System.out.print("반지름 입력 : ");
		radius = sc.nextInt();
		
		// setCircle() 메소드에게 반지름 값을 전달하고
		// 결과를 받아서 출력
		// 원 면적 : ...
		c.setCircle(radius);
		System.out.println("원 면적 : " + c.area());
		
		sc.close();

	}

}
