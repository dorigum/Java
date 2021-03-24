package com.scsa.java.sixth;

public class BookTest {

	public static void main(String[] args) {		
		// Book 생성자
		Book book1 = new Book("21424", "Java Basic", "김하나", "Jaen.kr", 15000, "Java 기본 문법");
		Book book2 = new Book("33455", "JDBC Pro", "김철수", "Jaen.kr", 23000, "");
		Book book3= new Book("55355", "Servlet/JSP", "박자바", "Jaen.kr", 41000, "Model2 기반");
		Book book4 = new Book("35332", "Android App", "홍길동", "Jaen.kr", 25000, "Lightweight Framework");
		Book book5 = new Book("35355", "OOAD 분석, 설계", "소나무", "Jaen.kr", 30000, "");
		
		// 인스턴스 생성 
		System.out.println("********************도서 목록********************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
	

		System.out.println();
		
		
		// Magazine 생성자
		Magazine magazine1 = new Magazine("35535", "Java world", "편집부", "Jaen.kr", 7000, " ", "2013", "2");
		Magazine magazine2 = new Magazine("33434", "Moblie World", "편집부", "Jaen.kr", 8000, " ", "2013", "8");
		Magazine magazine3 = new Magazine("75342", "Next web", "편집부", "Jaen.kr", 10000, "AJAX 소개", "2012", "10");
		Magazine magazine4 = new Magazine("76543", "Arichitecture", "편집부", "Jaen.kr", 5000, "java 시스템", "2013", "2");
		Magazine magazine5 = new Magazine("76534", "Data Modeling", "편집부", "Jaen.kr", 14000, " ", "2012", "12");
		
		
		System.out.println("********************잡지 목록********************");
		System.out.println(magazine1.toString());
		System.out.println(magazine2.toString());
		System.out.println(magazine3.toString());
		System.out.println(magazine4.toString());
		System.out.println(magazine5.toString());
		
	}

}
