package ch09.sec07;

// ��ư �̺�Ʈ ó������ �͸� ���� ��ü ���

public class Button {
	// �ʵ�
	OnClickListener listener;
	
	// Setter �޼ҵ�� ���� ��ü�� �޾Ƽ� �ʵ忡 ����
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// ��ư �̺�Ʈ�� �߻����� �� ȣ���ϴ� �޼ҵ�
	void touch() {
		// �������̽��� ���� ���� ��ü�� �޼ҵ� ȣ��
		listener.onClick();
	}
	
	// ��ø �������̽�
	interface OnClickListener{
		void onClick();
	}
}
