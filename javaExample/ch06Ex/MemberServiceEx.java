package javaExample.ch06Ex;

public class MemberServiceEx {
	// 6장_15번
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 passward가 올바르지 않습니다.");
			
		}

	}

}
