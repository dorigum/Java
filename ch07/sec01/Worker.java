package ch07.sec01;

public class Worker {
	private String joominNO;
	private String name;

	public Worker(String joominNo, String name) {
		this.joominNO = joominNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "주민번호 : " + joominNO + "\n성명 : " + name;
	
	}
	
}
