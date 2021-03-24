package projectEx;

import java.util.Scanner;

// 메뉴 출력

public class MainMenu {
	public static void main(String[] args) {
		// 메뉴 출력
		// 선택된 메뉴에 따라 해당 클래스의 메소드 호출
		Scanner sc = new Scanner(System.in);
		int menuNum;

		System.out.println("****************************************");
		System.out.println("\t도서 관리 프로그램");
		System.out.println("****************************************");

		System.out.println("\t다음 메뉴에서 선택");
		System.out.println("****************************************");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 정보 조회");
		System.out.println("3. 도서 정보 수정");
		System.out.println("4. 도서 정보 삭제");
		System.out.println("5. 종료");
		System.out.println("****************************************");

		System.out.println("메뉴 번호 입력 : ");
		menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			BookInsert bis = new BookInsert();
			bis.insert();
			break;
		case 5:
			System.out.println("----------------------------");
			System.out.println("종료합니다.");
		}

		sc.close();

	}
}