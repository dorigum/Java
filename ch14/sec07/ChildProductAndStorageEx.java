package ch14.sec07;

public class ChildProductAndStorageEx {

	public static void main(String[] args) {
		// 제너럴 타입의 상속
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		// 인터페이스 타입
		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);

	}

}
