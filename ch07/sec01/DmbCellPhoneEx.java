package ch07.sec01;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		DmbCellPhone dcp = new DmbCellPhone("자바폰", "검정", 10);
		
		// CellPhone으로 부터 상속받은 필드
		System.out.println("모델 : " + dcp.model);
		System.out.println("색상 : " + dcp.color);
		
		// DmbCellPhone 필드
		System.out.println("채널 : " + dcp.channel);
		
		// CellPhone으로 부터 상속받은 메소드 호출
		dcp.powerOn();
		dcp.bell();
		dcp.sendVoice("여보세요.");
		dcp.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dcp.sendVoice("아~예 반갑습니다.");
		dcp.hangUp();
		
		// DmbCellPhone 메소드 호출
		dcp.turnOnDmb();
		dcp.changeChannelDmb(12);
		dcp.turnOffDmb();
		
	}

}
