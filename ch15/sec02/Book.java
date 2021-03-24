package ch15.sec02;

public class Book {
	// 도서번호
	// 도서명
	// 저자
	// 가격
	// 발행일
	// 출판사

	private String bookNo; // 도서번호
	private String bookName; // 도서명
	private String bookAuthor; // 저자
	private int bookPrice; // 가격
	private String bookDate; // 발행일
	private String bookPulisher; // 출판사

	public Book(String bookNo, String bookName, String bookAuthor, int bookPrice, String bookDate,
			String bookPulisher) {
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookDate = bookDate;
		this.bookPulisher = bookPulisher;
	}

	@Override
	public String toString() {
		return bookNo + "\t" + bookName + "\t" + bookAuthor + "\t" +
				+ bookPrice + "\t" + bookDate + "\t" + bookPulisher;
	}

}