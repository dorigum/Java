package ch07.sec01;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("�ڹ���", "����", 10);
		
		// CellPhone���� ���� ��ӹ��� �ʵ�
		System.out.println("�� : " + dcp.model);
		System.out.println("���� : " + dcp.color);
		
		// DmbCellPhone �ʵ�
		System.out.println("ä�� : " + dcp.channel);
		
		// CellPhone���� ���� ��ӹ��� �޼ҵ� ȣ��
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("��������.");
		dcp.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dcp.sendVoice("��~�� �ݰ����ϴ�.");
		dcp.hangUp();
		
		// DmbCellPhone �޼ҵ� ȣ��
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
		
	}

}
