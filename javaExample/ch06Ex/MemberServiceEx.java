package javaExample.ch06Ex;

public class MemberServiceEx {
	// 6��_15��
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� passward�� �ùٸ��� �ʽ��ϴ�.");
			
		}

	}

}
