package ch14.sec03;

public class ProductEx {

	public static void main(String[] args) {
		// Product (TV) : kind : TV / model : ½º¸¶Æ® TV
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("½º¸¶Æ®TV");
		String tvModel = product1.getModel();
		// Tv tv = product1.getKind();
		System.out.println(tvModel);

		// Product (Car) : kind : Car / model : µðÁ©
		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("µðÁ©");
		String carModel = product2.getModel();
		// Car car = product2.getKind();
		System.out.println(carModel);

	}

}
