package ch06.sec03;

public class Book {
	
	String title;
	String author;
	int price;

	// 디폴트 생성자
	public Book() {
	// this() : 한 생성자에서 다른 생성자를 호출할 때 사용
		this("자바스크립트", "이몽룡", 22000);
	}

	// 매개변수가 있는 생성자
	public Book(String t, String au, int p) {
		title = t;
		author = au;
		price = p;
	}
	
	// file값 출력 메소드
	public void show() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price);
		
	}
}
