package com.scsa.java.fifth;

class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;

	Book(String is, String ti, String au, String pu, int pr, String de) {
				isbn = is;
				title = ti;
				author = au;
				publisher = pu;
				price = pr;
				desc = de;
			}
	
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

	
		/*	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
				this.isbn = isbn;
				this.title = title;
				this.author = author;
				this.publisher = publisher;
				this.price = price;
				this.desc = desc;
				}*/

	@Override
	public String toString() {
		return isbn + "\t|" + title + "\t|" + author + "\t|" + publisher + "\t|" + price + "\t|" + desc;
	}

}
