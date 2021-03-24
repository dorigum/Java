package ch08.sec02;

public interface RemoteControl {
	// ��� �ʵ� ����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ� ����
	// �߻� �޼ҵ� : ���� �ְ�, �ٵ� ���� �޼ҵ�
	// �ٵ� : ���� ���{...}
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// ����Ʈ �޼ҵ� ���� : ���� ����� ������ �ִ� �޼ҵ�
	// default �ٿ��� ��
	default void setMute(boolean mute) {
		if(mute) {	// if(mute==true)
			System.out.println("���� ó���մϴ�.");
		} else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// static �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
