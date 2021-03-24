package ch14.sec05;

public class CompareMethodEx {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과"); // 생략 가능
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		
		// 두 값을 비교하는 제네릭 메소드 compare() 호출
		boolean result1 = Util.<Integer, String>compare(p1, p2); // Integer, String 생략 가능

		if (result1) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
		
		
		
		// user1, 홍길동
		// user2, 홍길동
		// 비교해서 결과 출력
		Pair<String, String> p3 = new Pair<String, String>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2", "홍길동");
		
		boolean result2 = Util.compare(p3, p4); // Integer, String 생략 가능
		
		if (result2) {
			System.out.println("같은 사람입니다.");
		} else {
			System.out.println("다른 사람입니다.");
		}
		
		
	}

}
