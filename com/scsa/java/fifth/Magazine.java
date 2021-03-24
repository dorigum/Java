package com.scsa.java.fifth;

class Magazine {
	String isbn;
	String title;
	String author;
	String publisher;
	String year;
	String month;
	int price;
	String desc;

	public Magazine(String isbn, String title, String author, String publisher, String year, String month, int price,
			String desc) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publisher = year;
		this.publisher = month;
		this.price = price;
		this.desc = desc;

	}

	/*	Magazine(String is, String ti, String au, String pu, String ye, String mo,
				int pr, String de) {
			isbn = is;
			title = ti;
			author = au;
			publisher = pu;
			year = ye;
			month = mo;
			price = pr;
			desc = de;
		}*/

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

	@Override
	public String toString() {
		return isbn + "\t|" + title + "\t|" + author + "\t|" + publisher + "\t|" + year + "\t|" + month + "\t|" + price
				+ "\t|" + desc;
	}

}
