package ch07.sec05;

public class ComputerEx {

	public static void main(String[] args) {
		int r = 10;
		Calculator cal = new Calculator();
		System.out.println("원의 면적 : " + cal.areaCircle(r));
		
		Computer com = new Computer();
		System.out.println("원의 면적 : " + com.areaCircle(r));
		// 재정의된 메소드 호출
		
	}

}
