package ch07.sec11;

// �߻� Ŭ����
public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}

	// �߻� �޼ҵ� : ������ �Ǿ� ������
	// �ٵ� ���ǵǾ� ���� ���� �޼ҵ�
	// ��ӹ��� Ŭ�������� �ٵ� ����(������)
	public abstract void sound(); // �߻� �޼ҵ�

}
