package test.sec01;

// (1) Book, Magazine Ŭ���� ����
// ������ ���
// toString() ����ؼ� ���

public class BookTest {

	public static void main(String[] args) {
		Book bk1 = new Book();
		Book bk2 = new Book();

		bk1.setBook("21424", "Java Pro", "���ϳ�", "Jean.kr", 15000, "�⺻����");
		bk2.setBook("35355", "OOAD �м�, ����", "�ҳ���", "Jean.kr", 30000, "");
	
		
		Magazine mg = new Magazine();
		
		mg.setMagazine("35355", "Java World", "������", "androidjava.com", 7000, 2021, 3, "");
		
		System.out.println("***************************���� ���***************************");
		System.out.println(bk1);
		System.out.println(bk2);
		System.out.println(mg);
	}

}
