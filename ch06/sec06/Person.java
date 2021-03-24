package ch06.sec06;

// final필드 : 최종적인 값을 갖고 있는 필드
// 값을 변경할 수 없는 필드

public class Person {
	final String nation = "Korea"; // 고정값으로 초기화(상수)
	final String ssn; // 생성될 때 부여
	String name;
	
	// 생성자
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
}
