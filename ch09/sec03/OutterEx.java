package ch09.sec03;

public class OutterEx {

	public static void main(String[] args) {
		Outter outter = new Outter();
		// Inner Ŭ������ print() �޼ҵ� ȣ��
		Outter.Inner inner= outter.new Inner();
		inner.print();

	}

}
