package ch07.sec01;

public class CellPhone {
	// �ʵ�
	String model;
	String color;
	
	// �޼ҵ�
	public void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	public void sendVoice(String message) {
		System.out.println("�ڱ� : " + message);
	}
	void receiveVoice(String message){
		System.out.println("���� : " + message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
