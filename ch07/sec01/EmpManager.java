package ch07.sec01;

public class EmpManager {

	public static void main(String[] args) {
		Manager mg = new Manager(); // 하위 클래스의 객체 생성
		
		mg.setManager();
		mg.showManagerInfo();

	}

}
