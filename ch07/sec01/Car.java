package ch07.sec01;

public class Car {
	private String carNo;
	private String carName;
	private String carMaker;
	private int carYear;
	
	public Car(String carNo, String carName, String carMaker, int carYear) {
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
		this.carYear = carYear;
		
	}

	@Override
	public String toString() {
		return "차량 변호 : " + carNo + "\n차종 : " + carName +","
				+ "\n제조사 : " + carMaker + "\n연식" + carYear;
	}

}
