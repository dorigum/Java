package ch06.sec03;

public class Book {
	
	String title;
	String author;
	int price;

	// ����Ʈ ������
	public Book() {
	// this() : �� �����ڿ��� �ٸ� �����ڸ� ȣ���� �� ���
		this("�ڹٽ�ũ��Ʈ", "�̸���", 22000);
	}

	// �Ű������� �ִ� ������
	public Book(String t, String au, int p) {
		title = t;
		author = au;
		price = p;
	}
	
	// file�� ��� �޼ҵ�
	public void show() {
		System.out.println("������ : " + title);
		System.out.println("���� : " + author);
		System.out.println("���� : " + price);
		
	}
}
