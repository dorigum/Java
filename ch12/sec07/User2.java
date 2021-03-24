package ch12.sec07;

public class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) {
		this.setName("User2"); // [Source]-getther setter·Î ¼³Á¤
		this.calculator = calculator;
	}

	@Override
	public void run() {
		calculator.setMemory(50);
	}

}
