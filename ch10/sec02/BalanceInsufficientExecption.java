package ch10.sec02;

// 사용자 정의 예외 클래스 : Exception 클래스 상속
// 사용자 정의 예외 클래스에 필드, 메소드, 생성자 포함 가능하지만
// 대부분 생성자만 포함
// 기본 생성자/매개변수가 있는 생성자

public class BalanceInsufficientExecption extends Exception {
	public BalanceInsufficientExecption() { } // 기본 생성자
	
	// 매개변수가 있는 생성자
	// 예외 발생 원인(예외 메세지)를 상위 클래스 생성자에게 호출하기 위해
	// String 타입의 매개변수를 갖는 생성자 사용
	public BalanceInsufficientExecption(String message) {
		super(message);
	}

}

// String 타입의 매개변수를 갖는 생성자
// - 예외 발생 원인(예외 메세지)을 전달하기 위한 생성자
// - 상위 클래스의 생성자를 호출해서 예외 메세지를 전달
// - 예외 메세지의 용도 : catch{} 블록에서 예외 처리할 때 사용







