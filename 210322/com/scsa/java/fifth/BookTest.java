package com.scsa.java.fifth;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book("21424", "Java Pro", "김하나", "Jaen.kr", 15000, "기본 문법");
		Book book2 = new Book("35355", "OOAD 분석,설계", "소나무", "Jaen.kr", 30000, "");
		Book book3 = new Book("35535", "Java World", "편집부", "androidjava.com", 7000, "2013.2");

			System.out.println("********************도서 목록********************");
			System.out.println(book1.toString());
			System.out.println(book2.toString());
			System.out.println(book3.toString());

			/*		Magazine bbtest = new Magazine(); // 데이터 안넣어서 null값 출력
					Magazine bbtest2 = new Magazine();
					Magazine bbtest3 = new Magazine();*/
				
		/*			String strMagazine = bbtest.toString();
					System.out.println(bbtest);
						
					String strMagazine2 = bbtest2.toString();
					System.out.println(bbtest2);
							
					String strMagazine3 = bbtest3.toString();
					System.out.println(bbtest3);*/
	}

}
