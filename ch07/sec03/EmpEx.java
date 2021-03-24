package ch07.sec03;

public class EmpEx {

	public static void main(String[] args) {
		// 자식 클래스의 인스턴스(객체) 생성 : 자식 클래스의 생성자가 호출되면서
		// 자식 클래스의 생성자에게 매개변수 값이 전달
		// 부모 클래스의 생성자에게 전달할 매개변수도 같이 전달
		// 4개가 자식 클래스의 생성자에게 전달
		// 3개 : 부모 클래스 생성자에서 필드 값 초기화로 사용
		// 1개 : 자식 클래스 생성자에서 필드 값 초기화로 사용
		Manager mg = new Manager("1234", "홍길동", "마케팅", "대리");
		
		// 자식 객체 정보 출력
		// 자동으로 toString() 메소드 호출
		// 자식 클래스의 toString() 메소드에서
		// 부모 클래스의 toString() 메소드 호출
		System.out.println(mg);
		
	}

}
