package ch06.sec03;

import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, name, phone, address;
		int age;
		
		Member m1 = new Member("hkd","홍길동",30,"010-1234-5678","서울 강남구 대치동");
		m1.showMember();
		
		System.out.print("-------------------------------\n");
		
		System.out.print("아이디 입력 : ");
		id = sc.next();
		
		System.out.print("성명 입력 : ");
		name = sc.next();
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		
		System.out.print("전화번호 입력 : ");
		phone = sc.next();
		
		System.out.print("주소 입력 : ");
		address = sc.next();
		
		Member m2 = new Member(id, name, age, phone, address);
		m2.showMember();
		
		sc.close();

	}

}
