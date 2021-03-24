package javaExample.ch06Ex;

public class MemberService {
	// 6장_15번
	// boolean 타입으로 리턴
	// String id, String password
	boolean login(String id, String password) {
		// 매개값 id가 "hong", password가 12345일 경우에만 true로 리턴
		// 그 이외에는 false로 리턴

		// id == "hong" && password == 12345
		// equals : 문자열 비교!!
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println(id + " 님 로그아웃 되었습니다.");

	}
}
