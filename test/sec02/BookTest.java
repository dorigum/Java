package test.sec02;

import com.scsa.java.sixth.Book;
import com.scsa.java.sixth.Magazine;

// (2) Book, Magazine Ŭ���� ����
// ������ ���
// Encapsulation ���� : ������ ����(��ȣ)
// �ʵ�� �޼ҵ带 �Բ� ���� / �ʵ带 private���� �����ϰ� / ������ ����� Getter�� Setter�� ���� ���
// �ܺο����� �ʵ� ���� ���� �Ұ�

public class BookTest {

	public static void main(String[] args) {
		Book bk1 = new Book("21424", "Java Basic", "���ϳ�", "Jaen.kr", 15000, "Java �⺻ ����");
		Book bk2 = new Book("33455", "JDBC Pro", "��ö��", "Jaen.kr", 23000, "");
		Book bk3= new Book("55355", "Servlet/JSP", "���ڹ�", "Jaen.kr", 41000, "Model2 ���");
		Book bk4 = new Book("35332", "Android App", "ȫ�浿", "Jaen.kr", 25000, "Lightweight Framework");
		Book bk5 = new Book("35355", "OOAD �м�, ����", "�ҳ���", "Jaen.kr", 30000, "");

		
		Magazine mg1 = new Magazine("35535", "Java world", "������", "Jaen.kr", 7000, " ", "2013", "2");
		Magazine mg2 = new Magazine("33434", "Moblie World", "������", "Jaen.kr", 8000, " ", "2013", "8");
		Magazine mg3 = new Magazine("75342", "Next web", "������", "Jaen.kr", 10000, "AJAX �Ұ�", "2012", "10");
		Magazine mg4 = new Magazine("76543", "Arichitecture", "������", "Jaen.kr", 5000, "java �ý���", "2013", "2");
		Magazine mg5 = new Magazine("76534", "Data Modeling", "������", "Jaen.kr", 14000, " ", "2012", "12");
		
		System.out.println("***************************���� ���***************************");
		System.out.println(bk1);
		System.out.println(bk2);
		System.out.println(bk3);
		System.out.println(bk4);
		System.out.println(bk5);
		
		System.out.println("***************************���� ���***************************");
		System.out.println(mg1);
		System.out.println(mg2);
		System.out.println(mg3);
		System.out.println(mg4);
		System.out.println(mg5);
		
	}

}
