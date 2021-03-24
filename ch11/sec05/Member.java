package ch11.sec05;

// ����� ���� Ŭ���� �迭 : Arrays.sort()
// Arrays.sort()�� �ڵ����� �������� ����
// ����� ���� Ŭ���� �迭�� �����ϱ� ���ؼ���
// Ŭ������ Comparable �������̽��� �����ϰ� �־�� ������ �ȴ�.

public class Member implements Comparable<Member> {
	String name;

	public Member(String name) {
		this.name = name;
	}

	// �������̽� �߻� �޼ҵ� ������
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
		// compareTo() ���� ��
		// ���������� ��� : �ڽ��� �Ű� ������ ���� ��� ����,
		// ���� ��� 0,
		// ���� ��� ��� ��ȯ
		// name �ʵ� ������ ���� : �����ڵ� ��

	}

}
