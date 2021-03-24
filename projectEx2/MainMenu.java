package projectEx2;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNum;

		System.out.println("****************************************");
		System.out.println("\t상품 관리 프로그램");
		System.out.println("****************************************");

		System.out.println("\t다음 메뉴에서 선택");
		System.out.println("****************************************");
		System.out.println("1. 상품 등록");
		System.out.println("2. 상품 정보 조회");
		System.out.println("3. 상품 정보 수정");
		System.out.println("4. 상품 정보 삭제");
		System.out.println("5. 종료");
		System.out.println("****************************************");

		System.out.print("메뉴 번호 입력 : ");
		menuNum = sc.nextInt();

		switch (menuNum) {
		case 1:
			ItemInsert iis = new ItemInsert();
			iis.insert();
			break;
		case 5:
			System.out.println("----------------------------");
			System.out.println("종료합니다.");
		}

		sc.close();

	}
}