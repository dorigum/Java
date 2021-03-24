package ch07.sec05;

public class SuperAirplaneEx {

	public static void main(String[] args) {
		SuperAirplane sa = new SuperAirplane();

		sa.takeff();
		sa.fly();
		
		sa.flyMode = SuperAirplane.SUPERSONIC;
		sa.fly();
		
		sa.flyMode = SuperAirplane.NORMAL;
		sa.fly();
		
		sa.land();
		
	}

}
