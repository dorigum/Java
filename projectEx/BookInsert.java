package projectEx;

import java.util.Scanner;
import java.util.Vector;

// 도서 정보를 입력 받아서 Vector에 담아서 Controller에게 전달하는 역할
public class BookInsert {
	// Controller 클래스가 싱글톤이므로 getInstance() 호출해서 인스턴스 생성
	Controller controller = Controller.getInstance();
	Scanner sc = new Scanner(System.in);

	// 데이터 입력
	public void insert() {
		String bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock;

		System.out.println("\n****************************************");
		System.out.println("도서 정보 등록");
		System.out.println("\n****************************************");

		System.out.print("도서번호 입력 : ");
		bookNo = sc.next();
		// 앞에서 입력하고 엔터 친 결과, 엔터 값이 다음 값을 자동 저장되는 경우 발생

		sc.nextLine();

		System.out.print("도서명 입력 : ");
		bookName = sc.nextLine();

		System.out.print("저자 입력 : ");
		bookAuthor = sc.nextLine();

		System.out.print("가격 입력 : ");
		bookPrice = sc.nextLine();

		System.out.print("발행일 입력 : ");
		bookDate = sc.nextLine();

		System.out.print("재고 입력 : ");
		bookStock = sc.nextLine();

		System.out.println("\n****************************************");

		// Vector에 저장
		Vector<String> v = new Vector<String>();
		v.add(bookNo);
		v.add(bookName);
		v.add(bookAuthor);
		v.add(bookPrice);
		v.add(bookDate);
		v.add(bookStock);

		// Controller에게 입력 받은 데이터 전달
		controller.insert(v);
		sc.close();

	}
}
