package ch09.sec06;

public class Anonymous {
	// 1. Ŭ������ �ʵ� �ʱⰪ���� �͸� ���� ��ü�� �����ؼ� ����
	// �ʵ�
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
			
		}
		
	};
	
	// 2. �޼ҵ� ������ ���� ������ ������ ��
	// �ʱⰪ���� �͸� ���� ��ü�� �����ؼ� ����
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}

			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};
		
		localVar.turnOn();
		
	}
	
	// 3. �޼ҵ��� �Ű������� �͸� ���� ��ü ����
	// �޼ҵ��� �Ű������� �޼ҵ� ȣ�� �ڵ忡�� �͸� ���� ��ü�� �����ؼ� ����
	void method2(RemoteControl rc) {
		rc.turnOn();
	}

}
