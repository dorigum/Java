package ch11.sec03;

// 문자열 분리 방법
// (1) String 클래스의 split() 메소드 이용
// (2) java.util.StringTokenizer 클래스 사용


// (1) String 클래스의 split() 메소드 이용
public class SplitEx {

	public static void main(String[] args) {
		String text = "홍길동/이몽룡/성춘향";
		String[] names = text.split("/");	// 구분자 : 슬래시(/)
		
		for(String name : names) {
			System.out.println(name);
		}
		
		String text2 = "홍길동&이몽룡,성춘향,변학도-박병호";
		String[] names2 = text2.split("&|,|-");
		
		for(String name : names2) {
			System.out.println(name);
		}
		
	}

}
