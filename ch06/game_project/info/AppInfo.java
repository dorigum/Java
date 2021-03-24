package ch06.game_project.info;

public class AppInfo {
	String appName, appMaker, appContents;
	
	public AppInfo() {
		appName = "★★게임";
		appMaker = "홍길동";
		appContents = "가위바위보 게임/숫자 알아맞히기 게임";
	}
	
	public void showAppInfo() {
		System.out.println("*********************");
		System.out.println("\t\t애플리케이션 정보");
		System.out.println("---------------------");
		System.out.println("제목 : " + appName);
		System.out.println("제작자 : " + appMaker);
		System.out.println("내용 : " + appContents);
		System.out.println("*********************");
		
	}
}
