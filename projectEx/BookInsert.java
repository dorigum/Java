package projectEx;

import java.util.Scanner;
import java.util.Vector;

// ���� ������ �Է� �޾Ƽ� Vector�� ��Ƽ� Controller���� �����ϴ� ����
public class BookInsert {
	// Controller Ŭ������ �̱����̹Ƿ� getInstance() ȣ���ؼ� �ν��Ͻ� ����
	Controller controller = Controller.getInstance();
	Scanner sc = new Scanner(System.in);

	// ������ �Է�
	public void insert() {
		String bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock;

		System.out.println("\n****************************************");
		System.out.println("���� ���� ���");
		System.out.println("\n****************************************");

		System.out.print("������ȣ �Է� : ");
		bookNo = sc.next();
		// �տ��� �Է��ϰ� ���� ģ ���, ���� ���� ���� ���� �ڵ� ����Ǵ� ��� �߻�

		sc.nextLine();

		System.out.print("������ �Է� : ");
		bookName = sc.nextLine();

		System.out.print("���� �Է� : ");
		bookAuthor = sc.nextLine();

		System.out.print("���� �Է� : ");
		bookPrice = sc.nextLine();

		System.out.print("������ �Է� : ");
		bookDate = sc.nextLine();

		System.out.print("��� �Է� : ");
		bookStock = sc.nextLine();

		System.out.println("\n****************************************");

		// Vector�� ����
		Vector<String> v = new Vector<String>();
		v.add(bookNo);
		v.add(bookName);
		v.add(bookAuthor);
		v.add(bookPrice);
		v.add(bookDate);
		v.add(bookStock);

		// Controller���� �Է� ���� ������ ����
		controller.insert(v);
		sc.close();

	}
}
