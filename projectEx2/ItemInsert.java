package projectEx2;

import java.util.Scanner;
import java.util.Vector;

public class ItemInsert {
	Controller controller = Controller.getInstance();
	Scanner sc = new Scanner(System.in);

	public void insert() {
		String itemNo, itemName, itemMaker, itemPrice, itemDate, itemCount;

		System.out.println("\n****************************************");
		System.out.println("��ǰ ���� ���");
		System.out.println("\n****************************************");

		System.out.print("��ǰ��ȣ �Է� : ");
		itemNo = sc.next();

		sc.nextLine();

		System.out.print("��ǰ�� �Է� : ");
		itemName = sc.nextLine();

		System.out.print("������ �Է� : ");
		itemMaker = sc.nextLine();

		System.out.print("���� �Է� : ");
		itemPrice = sc.nextLine();

		System.out.print("������ �Է� : ");
		itemDate = sc.nextLine();

		System.out.print("��� �Է� : ");
		itemCount = sc.nextLine();

		System.out.println("\n****************************************");

		Vector<String> v = new Vector<String>();
		v.add(itemNo);
		v.add(itemName);
		v.add(itemMaker);
		v.add(itemPrice);
		v.add(itemDate);
		v.add(itemCount);

		controller.insert(v);
		sc.close();

	}
}
