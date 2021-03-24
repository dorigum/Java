package ch06.sec04;

public class ShareEx {

	public static void main(String[] args) {
		Share s1, s2;
		
		s1 = new Share();
		s1.set(5); // a=5, staticA=5
		
		System.out.println("s1ÀÇ a : " + s1.showA());
		System.out.println("staticA : " + Share.showStaticA());
		
		s2 = new Share();
		s2.set(100); // a=100, staticA=105
		
		System.out.println("s2ÀÇ a : " + s2.showA());
		System.out.println("staticA : " + Share.showStaticA());

	}

}
