package ch09.sec06;

public class AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 1. �͸� ��ü�� ���Ե� �ʵ� ���
		anony.field.turnOn();
		
		// 2. �͸� ��ü ���� ���� ���
		anony.method1();
		
		// 3. �͸� ��ü �Ű��� ���
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("SmartTV�� �մϴ�.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("SmartTV�� ���ϴ�.");
				
			}
			
		});

	}

}
