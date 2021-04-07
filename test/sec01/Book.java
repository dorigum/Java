package test.sec01;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;

	// ������ ������� ����
	// �ʵ忡 ���� ������ �� �ִ� �޼ҵ� �ʿ�
	public void setBook(String isbn, String title, String author, String publisher, int price, String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	// toString() �������̵�
	@Override
	public String toString() {
		return isbn + "|" + title + "|" + author + "|" + publisher + "|" + price + "|" + desc;
	}

}