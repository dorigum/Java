package ch08.sec01;

// ���� Ŭ����
// �������̽��� �����ϸ�, �������̽��� �߻� �޼ҵ尡 �ڵ����� ������ �� : �ʼ�

public class Audio implements RemoteControl {
	// �ʵ�
	private int volume;
	private boolean mute;
	
	
	@Override
	public void turnOn() {
		System.out.println("������� �մϴ�.");

	}

	@Override
	public void turnOff() {
		System.out.println("������� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume <= RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		} else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
	
	

}
