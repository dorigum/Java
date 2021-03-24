package ch15.sec05;

import java.util.Scanner;

public class nextAndLineEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		//String name = sc.nextLine(); // 띄어쓰기가 포함되어 같이 출력 ex) 홍 길동 -> 홍 길동
		String name = sc.next(); // 띄어쓰기 전 문자까지만 출력 ex) 홍 길동 -> 홍
		
		System.out.println(name);

	}

}
