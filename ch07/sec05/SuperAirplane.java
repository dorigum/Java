package ch07.sec05;

public class SuperAirplane extends Airplane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("������ �����Դϴ�.");
		} else {
			// Airplane ��ü�� fly() �޼ҵ� ȣ��
		super.fly();
		}
	
	}

}
