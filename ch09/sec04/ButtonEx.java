package ch09.sec04;

public class ButtonEx {

	public static void main(String[] args) {
		// ��ȭ�� �̴ϴ�.
		// �޼����� �����ϴ�.
		
		// Button ��ü ����
		Button btn = new Button();
		
		// Button�� Setter ȣ���ؼ� ����
		// ��ư Ŭ������ �� ȣ��Ǵ� �޼ҵ� ȣ�� - ��ư Ŭ�� �̺�Ʈ ó��
		// (1)
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		
		// (2)
		CallListener call = new CallListener();
		btn.setOnClickListener(call);
		btn.touch();
		
		MessageListener msg = new MessageListener();
		btn.setOnClickListener(msg);
		btn.touch();
		
		
		// �͸� ���� ��ü ���(���� Ŭ���� �������� �ʰ�)
		// ���� Ŭ������ ������ �ʰ�
		// ���� �͸� ���� ��ü�� �����ؼ� �̺�Ʈ ó���� �ϴ� ��찡 �� ����
		btn.setOnClickListener(new Button.OnClickListener() {
			// OnClickListener �������̽��� �߻� �޼ҵ� onClick() ������
			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");
				
			}
		});

		btn.touch();
		
	}

}
