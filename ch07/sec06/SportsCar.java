package ch07.sec06;

public class SportsCar extends MyCar {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final 메소드는 오버라이딩(재정의) 할 수 없다.
	/*@Override
	public void stop() {
		System.out.println("스포츠카 멈춤");
		speed = 0;*/
	}