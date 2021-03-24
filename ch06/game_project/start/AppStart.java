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
			System.out.println("\t�ڡڰ��ӿ� ���� ���� ȯ���մϴ�^^");
			System.out.println("***************************");
			
			
		do {
			System.out.println("\t\t\t �޴�");
			System.out.println("-----------------------");
			System.out.println("1. ���ø����̼� ����");
			System.out.println("2. ���������� ����");
			System.out.println("3. ���� �˾� ������ ����");
			System.out.println("4. ����");
			System.out.println("-----------------------");
			
			
			System.out.println("�޴� ��ȣ �Է� : ");
			menuNum = sc.nextInt();
			
			
			switch(menuNum) {
			case 1 :
				AppInfo info = new AppInfo();
				info.showAppInfo();
				break;
				
			case 2 :
				System.out.println("***************************");
				System.out.println("\t\t���������� ����");
				GaBaBo gbb = new GaBaBo();
				gbb.play();
				break;
				
			case 3 :
				System.out.println("***************************");
				System.out.println("\t\t���� �˾Ƹ����� ����");
				Guess g = new Guess();
				g.play();
				
			case 4 :	// switch�� ���������� ���� ���
				break;
				
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.\n");
			}	// switch ����
			
		}
			
			while (menuNum != 4);
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ���.\n");
				// ���⿡ �� �Է��ϴ°���??????????????
		}
}
