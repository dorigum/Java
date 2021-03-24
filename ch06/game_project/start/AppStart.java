package ch06.game_project.start;

import java.util.Scanner;

import ch06.game_project.game.GaBaBo;
import ch06.game_project.game.Guess;
import ch06.game_project.info.AppInfo;

public class AppStart {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int menuNum;
			
			System.out.println("***************************");
			System.out.println("\t★★게임에 오신 것을 환영합니다^^");
			System.out.println("***************************");
			
			
		do {
			System.out.println("\t\t\t 메뉴");
			System.out.println("-----------------------");
			System.out.println("1. 애플리케이션 정보");
			System.out.println("2. 가위바위보 게임");
			System.out.println("3. 숫자 알아 맞히기 게임");
			System.out.println("4. 종료");
			System.out.println("-----------------------");
			
			
			System.out.println("메뉴 번호 입력 : ");
			menuNum = sc.nextInt();
			
			
			switch(menuNum) {
			case 1 :
				AppInfo info = new AppInfo();
				info.showAppInfo();
				break;
				
			case 2 :
				System.out.println("***************************");
				System.out.println("\t\t가위바위보 게임");
				GaBaBo gbb = new GaBaBo();
				gbb.play();
				break;
				
			case 3 :
				System.out.println("***************************");
				System.out.println("\t\t숫자 알아맞히기 게임");
				Guess g = new Guess();
				g.play();
				
			case 4 :	// switch문 빠져나가서 종료 출력
				break;
				
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.\n");
			}	// switch 종료
			
		}
			
			while (menuNum != 4);
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.\n");
				// 여기에 뭐 입력하는거지??????????????
		}
}
