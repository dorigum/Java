package ch15.sec02;

import java.util.ArrayList;

public class BookArrayListEx {

	public static void main(String[] args) {
		// 도서 5권 등록하고, 도서 정보 출력
		ArrayList<Book> list = new ArrayList<Book>(5);

		Book b1 = new Book("1001", "자바", "홍길동", 20000, "2021-01-01", "서울출판사");
		Book b2 = new Book("1002", "파이썬", "이몽룡", 22000, "2020-05-01", "선릉출판사");
		Book b3 = new Book("1003", "C++", "성춘향", 15000, "2020-11-11", "강남출판사");
		Book b4 = new Book("1004", "Spring", "김대리", 27000, "2021-03-01", "강북출판사");
		Book b5 = new Book("1005", "JSP", "박과장", 30000, "2021-02-21", "경기출판사");

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		System.out.println(list.size());

		// 출력 형태
		// 1001 .......
		for (int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			System.out.println(book);

		}
	}

}
