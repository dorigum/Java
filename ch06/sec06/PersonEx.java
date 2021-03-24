package ch06.sec06;

public class PersonEx {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA"; // final필드 수정 불가
		//p1.ssn = "654321-7654321"; // final필드 수정 불가
		p1.name = "이몽룡"; // final필드 아니여서 수정 가능!
		
	}

}
