package javaExample.ch07Ex;

public class SnowTireEx {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();	// SnowTire Ŭ�������� run() ������

	}

}
