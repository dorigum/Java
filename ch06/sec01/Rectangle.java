package ch06.sec01;

import java.util.Scanner;

public class Rectangle {
		// 필드
		int width;
		int height;

		// 메소드
		public void input() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("가로 길이 입력 : ");
			width = sc.nextInt();
			
			System.out.print("세로 길이 입력 : ");
			height = sc.nextInt();
			
			sc.close();
		}
		
		public void area() {
			System.out.println("사각형의 면적 : " + (width*height));
			
		}

}
