package ch08.sec01;

public class RemoteControlEx {

	public static void main(String[] args) {
		// �������̽� ���� ����
		RemoteControl rc = null;
		
		rc = new Television(); // Television ��ü�� �ν��Ͻ� Ÿ�Կ� ����
		rc.turnOn();		// �߻� �޼ҵ� ���
		rc.setVolume(10);	// �߻� �޼ҵ� ���
		rc.setMute(true);	// ����Ʈ �޼ҵ� ���
		rc.setMute(false);	// ����Ʈ �޼ҵ� ���
		rc.turnOff();		// �߻� �޼ҵ� ���
		
		rc = new Audio(); 	// Television ��ü�� �ν��Ͻ� Ÿ�Կ� ����
		rc.turnOn();		// �߻� �޼ҵ� ���
		rc.setVolume(12);	// �߻� �޼ҵ� ���
		rc.setMute(true);	// ����Ʈ �޼ҵ� ������ ���
		rc.turnOff();		// �߻� �޼ҵ� ���

		// static �޼ҵ� ���
		RemoteControl.changeBattery();
		
	}

}
