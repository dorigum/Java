package ch08.sec02;

public class SmartRemoteControlEx {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		rc.turnOff();
		
		Searchable sch = tv;
		sch.search("www.naver.com");

	}

}
