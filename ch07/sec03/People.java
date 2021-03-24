package ch07.sec03;

public class People {
	// 필드 : name, ssn
	private String name;
	private String ssn;
	
	// 생성자에서 초기화 : 매개변수로 전달 받아서
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	// toString() 사용 출력
	@Override
	public String toString() {
		return "name : " + name + ", ssn : " + ssn;
	}
	
}


// People 클래스를 상속 받는 Student 클래스 생성
// 필드 : stdNo
// 생성자 초기화 : 매개변수로 전달 받아서
// 부모 생성자에게 매개변수 전달
// toString() 사용 출력

// 실행 클래스 : StudentEx