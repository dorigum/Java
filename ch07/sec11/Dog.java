package ch07.sec11;

public class Dog extends Animal {
	public Dog() {
		this.kind = "������";
	}
	
	// �߻� �޼ҵ� ������
	// �ʼ�
	// Ŭ���� ���� �� �ڵ� ���ԵǾ� ����
	@Override
	public void sound() {
		System.out.println("�۸�");

	}

}
