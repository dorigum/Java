package javaExample.ch06Ex;

public class ShopService {
	// 6Àå_18¹ø
	// ½Ì±ÛÅæ »ç¿ë
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		return shopservice;
		
	}
}
