package javaExample.ch06Ex;

public class ShopService {
	// 6��_18��
	// �̱��� ���
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopservice;
		
	}
}
