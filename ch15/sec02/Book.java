package ch15.sec02;

public class Book {
	// ������ȣ
	// ������
	// ����
	// ����
	// ������
	// ���ǻ�

	private String bookNo; // ������ȣ
	private String bookName; // ������
	private String bookAuthor; // ����
	private int bookPrice; // ����
	private String bookDate; // ������
	private String bookPulisher; // ���ǻ�

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