package javaExample.ch06Ex;

public class MemberService {
	// 6��_15��
	// boolean Ÿ������ ����
	// String id, String password
	boolean login(String id, String password) {
		// �Ű��� id�� "hong", password�� 12345�� ��쿡�� true�� ����
		// �� �̿ܿ��� false�� ����

		// id == "hong" && password == 12345
		// equals : ���ڿ� ��!!
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}

	void logout(String id) {
		System.out.println(id + " �� �α׾ƿ� �Ǿ����ϴ�.");

	}
}
