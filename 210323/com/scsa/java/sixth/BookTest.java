package com.scsa.java.sixth;

public class BookTest {

	public static void main(String[] args) {		
		// Book ������
		Book book1 = new Book("21424", "Java Basic", "���ϳ�", "Jaen.kr", 15000, "Java �⺻ ����");
		Book book2 = new Book("33455", "JDBC Pro", "��ö��", "Jaen.kr", 23000, "");
		Book book3= new Book("55355", "Servlet/JSP", "���ڹ�", "Jaen.kr", 41000, "Model2 ���");
		Book book4 = new Book("35332", "Android App", "ȫ�浿", "Jaen.kr", 25000, "Lightweight Framework");
		Book book5 = new Book("35355", "OOAD �м�, ����", "�ҳ���", "Jaen.kr", 30000, "");
		
		// �ν��Ͻ� ���� 
		System.out.println("********************���� ���********************");
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
		System.out.println(book5.toString());
	

		System.out.println();
		
		
		// Magazine ������
		Magazine magazine1 = new Magazine("35535", "Java world", "������", "Jaen.kr", 7000, " ", "2013", "2");
		Magazine magazine2 = new Magazine("33434", "Moblie World", "������", "Jaen.kr", 8000, " ", "2013", "8");
		Magazine magazine3 = new Magazine("75342", "Next web", "������", "Jaen.kr", 10000, "AJAX �Ұ�", "2012", "10");
		Magazine magazine4 = new Magazine("76543", "Arichitecture", "������", "Jaen.kr", 5000, "java �ý���", "2013", "2");
		Magazine magazine5 = new Magazine("76534", "Data Modeling", "������", "Jaen.kr", 14000, " ", "2012", "12");
		
		
		System.out.println("********************���� ���********************");
		System.out.println(magazine1.toString());
		System.out.println(magazine2.toString());
		System.out.println(magazine3.toString());
		System.out.println(magazine4.toString());
		System.out.println(magazine5.toString());
		
	}

}
