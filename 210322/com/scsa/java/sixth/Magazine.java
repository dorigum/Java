package com.scsa.java.sixth;

public class Magazine {
	// Encapsulation
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;
	private String year;
	private String month;
	
	public Magazine() {
		isbn = "";
		title = "";
		author = "";
		publisher = "";
		price = 0;
		desc = "";
		year ="";
		month ="";
	}

	public Magazine(String isbn, String title, String author, String publisher, int price, String desc, String year,
			String month) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
		this.year = year;
		this.month = month;
		}
	
	
	public Magazine(String isbn, String title, String author, String publisher, int price, String year, String month) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.year = year;
		this.month = month;
		}
	
	
	// getter, setter
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	// toString
	@Override
	public String toString() {
		return isbn + "\t|" + title + "\t|" + author + "\t|" + publisher + "\t|" + price + "\t|" + desc + "\t|" + year
				+ "." + month;
	}

}
