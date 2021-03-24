package ch09.sec03;

public class OutterEx {

	public static void main(String[] args) {
		Outter outter = new Outter();
		// Inner 클래스의 print() 메소드 호출
		Outter.Inner inner= outter.new Inner();
		inner.print();

	}

}
