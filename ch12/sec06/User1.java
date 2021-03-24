package ch12.sec06;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User1"); // [Source]-getther setter·Î ¼³Á¤
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}

}
