package ch06.game_project.info;

public class AppInfo {
	String appName, appMaker, appContents;
	
	public AppInfo() {
		appName = "�ڡڰ���";
		appMaker = "ȫ�浿";
		appContents = "���������� ����/���� �˾Ƹ����� ����";
	}
	
	public void showAppInfo() {
		System.out.println("*********************");
		System.out.println("\t\t���ø����̼� ����");
		System.out.println("---------------------");
		System.out.println("���� : " + appName);
		System.out.println("������ : " + appMaker);
		System.out.println("���� : " + appContents);
		System.out.println("*********************");
		
	}
}
