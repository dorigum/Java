package projectEx2;

import java.util.Scanner;
import java.util.Vector;

public class ItemInsert {
	Controller controller = Controller.getInstance();
	Scanner sc = new Scanner(System.in);

	public void insert() {
		String itemNo, itemName, itemMaker, itemPrice, itemDate, itemCount;

		System.out.println("\n****************************************");
		System.out.println("상품 정보 등록");
		System.out.println("\n****************************************");

		System.out.print("상품번호 입력 : ");
		itemNo = sc.next();

		sc.nextLine();

		System.out.print("상품명 입력 : ");
		itemName = sc.nextLine();

		System.out.print("제조사 입력 : ");
		itemMaker = sc.nextLine();

		System.out.print("가격 입력 : ");
		itemPrice = sc.nextLine();

		System.out.print("제조일 입력 : ");
		itemDate = sc.nextLine();

		System.out.print("재고 입력 : ");
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
